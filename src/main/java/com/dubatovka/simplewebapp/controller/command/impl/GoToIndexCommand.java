package com.dubatovka.simplewebapp.controller.command.impl;

import com.dubatovka.simplewebapp.controller.command.PageNavigator;
import com.dubatovka.simplewebapp.controller.command.Command;

import javax.servlet.http.HttpServletRequest;

public class GoToIndexCommand implements Command {
    
    public PageNavigator execute(HttpServletRequest request) {
        return PageNavigator.FORWARD_PAGE_INDEX;
    }
}
