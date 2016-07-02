/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tientx.supercode.bookstore.database;

//import java.io.File;
//import java.io.FileInputStream;
//import java.io.IOException;
//import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
//import java.util.Properties;

/**
 *
 * @author zOzDarKzOz
 */
public class SingleDBConnection {

    public static SingleDBConnection instance = null;
    private Connection conn = null;

    private SingleDBConnection() {
        try {
//            Properties properties = new Properties();
//            InputStream is = this.getClass().getClassLoader().getResourceAsStream("main/resources/properties/config.properties");
//            try {
//                properties.load(is);
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
//            properties.stringPropertyNames().stream().forEach((property) -> {
//                String value = properties.getProperty(property);
//                System.out.println(property + "=" + value);
//            });
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbBookStore2?user=root&password=&characterEncoding=UTF-8");
//            Class.forName(properties.getProperty("DRIVER_CLASSNAME"));
//            conn = DriverManager.getConnection(properties.getProperty("CONNECT_STRING"));
        } catch (SQLException | ClassNotFoundException ex) {
            ex.printStackTrace();
        }
    }

    public static SingleDBConnection getInstance() {
        if (instance == null) {
            return new SingleDBConnection();
        }
        return instance;
    }

    public Connection getConnection() {
        return conn;
    }

//    public static void main(String[] args) {
//        System.out.println(SingleDBConnection.getInstance().getConnection().toString());
//    }
}
