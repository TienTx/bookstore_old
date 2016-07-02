/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tientx.supercode.bookstore.database;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/**
 *
 * @author zOzDarKzOz
 */
public class SingleDBConnection1 {

    public static SingleDBConnection1 instance = null;
    private Connection conn = null;
    private static final String DBCONFIGFILE = "dbconfig.properties";
    private static final String DBCONFIGFILEPATH = System.getenv("property-name");
//    private static final String DBCONFIGFILEPATH = "src/main/resources/properties/";

    private SingleDBConnection1() {
        try {
            File file = new File(DBCONFIGFILEPATH + DBCONFIGFILE);
//            System.out.println(System.getProperty("user.dir"));
            Properties properties;
            try (FileInputStream fis = new FileInputStream(file)) {
                properties = new Properties();
                properties.load(fis);
            }
//            properties.stringPropertyNames().stream().forEach((property) -> {
//                String value = properties.getProperty(property);
//                System.out.println(property + "=" + value);
//            });
            Class.forName(properties.getProperty("DRIVER_CLASSNAME"));
            conn = DriverManager.getConnection(properties.getProperty("CONNECT_STRING"));
        } catch (SQLException | IOException | ClassNotFoundException ex) {
            ex.printStackTrace();
        }
    }

    public static SingleDBConnection1 getInstance() {
        if (instance == null) {
            return new SingleDBConnection1();
        }
        return instance;
    }

    public Connection getConnection() {
        return conn;
    }
    
    public static void main(String[] args) {
        System.out.println(SingleDBConnection1.getInstance().getConnection().toString());
    }
}
