package com.dubatovka.simplewebapp.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Create database connection
 */

public class DBConnection {
    private static Connection connection;
    
    private DBConnection() {
    }
    
    public static Connection getConnection() {
        try {
            if (connection == null || connection.isClosed()) {
                String url = "jdbc:mysql://localhost:3306/simpleweb";
                String user = "root";
                String password = "int1984";
                
                Class.forName("com.mysql.jdbc.Driver");
                
                connection = DriverManager.getConnection(url, user, password);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return connection;
    }
}
