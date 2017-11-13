package com.dubatovka.simplewebapp.service;

import com.dubatovka.simplewebapp.service.impl.UserServiceImpl;

public final class ServiceFactory {
    private static final ServiceFactory INSTANCE = new ServiceFactory();
    private UserService userService;
    
    private ServiceFactory() {
    }
    
    public static ServiceFactory getInstance() {
        return INSTANCE;
    }
    
    public UserService getUserService() {
        if (userService == null) {
            userService = new UserServiceImpl();
        }
        return userService;
    }
}