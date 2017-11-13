package com.dubatovka.simplewebapp.service.impl;

import com.dubatovka.simplewebapp.service.UserService;
import com.dubatovka.simplewebapp.dao.UserDAO;
import com.dubatovka.simplewebapp.dao.exception.DAOException;
import com.dubatovka.simplewebapp.entity.User;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.List;

public class UserServiceImpl extends AbstractService implements UserService {
    private static final Logger LOGGER = LogManager.getLogger(UserServiceImpl.class);
    private UserDAO userDAO = daoFactory.getUserDAO();
    
    /**
     * Получить всех пользователей из базы данных.
     */
    public List<User> getAllUsers() {
        List<User> userList = null;
        try {
            userList = userDAO.readUsers();
        } catch (DAOException e) {
            LOGGER.log(Level.ERROR, e.getMessage());
        }
        
        return userList;
    }
    
    /**
     * Получить список пользователей, удовлетворяющих полученным критериям имени и фамилии.
     */
    public List<User> getUsersByFirstAndLastName(String fName, String lName) {
        List<User> userList = null;
        try {
            userList = userDAO.readUsers(fName, lName);
        } catch (DAOException e) {
            LOGGER.log(Level.ERROR, e.getMessage());
        }
        return userList;
    }
}
