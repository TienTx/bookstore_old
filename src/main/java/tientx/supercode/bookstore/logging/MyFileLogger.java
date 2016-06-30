/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tientx.supercode.bookstore.logging;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Properties;

/**
 *
 * @author zOzDarKzOz
 */
public class MyFileLogger {

    public static MyFileLogger instance = null;

    private boolean isEnabled = false;
    private final File file = new File("log.txt");
    private FileOutputStream fos = null;
    private final SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
    private final DateFormat df = new SimpleDateFormat("EEEE");

    private MyFileLogger() {
        isEnabled = isFileLoggingEnabled();
        try {
            if (!file.exists()) {
                file.createNewFile();
            }
            fos = new FileOutputStream(file);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private boolean isFileLoggingEnabled() {
        Properties p = new Properties();
        try {
            p.load(ClassLoader.getSystemResourceAsStream(
                    "Logger.properties"));
            String fileLoggingValue
                    = p.getProperty("FileLogging");
            if (fileLoggingValue.equalsIgnoreCase("ON") == true) {
                return true;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }

    public static MyFileLogger getInstance() {
        if (instance == null) {
            return new MyFileLogger();
        }
        return instance;
    }

    public synchronized void log(String msg) {
        if (isEnabled) {
            try {
                Calendar c = Calendar.getInstance();
                msg = df.format(c.getTime()) + " " + sdf.format(c.getTime()) + "\n" + msg;
                byte[] content = msg.getBytes();
                fos.write(content);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

}
