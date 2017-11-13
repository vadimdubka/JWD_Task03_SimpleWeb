package com.dubatovka.simplewebapp.dao;

import com.dubatovka.simplewebapp.dao.impl.UserDAOImpl;

public final class DAOFactory {
    private static final DAOFactory INSTANCE = new DAOFactory();
    private UserDAO userDAO;
    
    private DAOFactory() {
    }
    
    public static DAOFactory getInstance() {
        return INSTANCE;
    }
    
    public UserDAO getUserDAO() {
        if (userDAO == null) {
            userDAO = new UserDAOImpl();
        }
        return userDAO;
    }
    
}