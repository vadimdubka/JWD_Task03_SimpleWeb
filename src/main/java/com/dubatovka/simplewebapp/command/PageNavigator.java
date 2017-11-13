package com.dubatovka.simplewebapp.command;

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