package com.dubatovka.simplewebapp.dao.impl;

import com.dubatovka.simplewebapp.dao.DBConnection;

import java.sql.Connection;

public abstract class AbstractDAO {
    protected Connection connection;
    
    protected AbstractDAO() {
        connection = DBConnection.getConnection();
    }
    
    public Connection getConnection() {
        return connection;
    }
    
    public void setConnection(Connection connection) {
        this.connection = connection;
    }
}