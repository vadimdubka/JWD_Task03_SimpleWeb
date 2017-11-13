package com.dubatovka.simplewebapp.controller;

public class ConfigConstant {
    
    /**
     * Attribute local names
     */
    public static final String ATTR_USERS = "users";
    
    /**
     * Parameter names
     */
    public static final String PARAM_COMMAND = "command";
    public static final String PARAM_NAME = "name";
    public static final String PARAM_SURNAME = "surname";
    
    /**
     * Navigation response types
     */
    public static final String FORWARD = "forward";
    public static final String REDIRECT = "redirect";
    
    /**
     * Common JSP pages paths
     */
    public static final String PAGE_INDEX = "/index.html";
    public static final String PAGE_USERS = "/pages/users.jsp";
    
    private ConfigConstant() {
    }
}