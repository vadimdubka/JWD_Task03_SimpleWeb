package com.dubatovka.simplewebapp.controller.command;

import static com.dubatovka.simplewebapp.controller.ConfigConstant.FORWARD;
import static com.dubatovka.simplewebapp.controller.ConfigConstant.PAGE_INDEX;
import static com.dubatovka.simplewebapp.controller.ConfigConstant.PAGE_USERS;

public enum PageNavigator {
    FORWARD_PAGE_INDEX(PAGE_INDEX, FORWARD),
    FORWARD_PAGE_USERS(PAGE_USERS, FORWARD);
    
    private String query;
    private String responseType;
    
    PageNavigator(String query, String responseType) {
        this.query = query;
        this.responseType = responseType;
    }
    
    public String getQuery() {
        return query;
    }
    
    public String getResponseType() {
        return responseType;
    }
}