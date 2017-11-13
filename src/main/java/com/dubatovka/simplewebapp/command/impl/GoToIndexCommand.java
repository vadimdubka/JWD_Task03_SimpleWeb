package com.dubatovka.simplewebapp.command.impl;

import com.dubatovka.simplewebapp.command.PageNavigator;
import com.dubatovka.simplewebapp.command.Command;

import javax.servlet.http.HttpServletRequest;

public class GoToIndexCommand implements Command {
    
    public PageNavigator execute(HttpServletRequest request) {
        return PageNavigator.FORWARD_PAGE_INDEX;
    }
}
