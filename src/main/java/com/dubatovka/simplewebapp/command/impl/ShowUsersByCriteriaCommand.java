package com.dubatovka.simplewebapp.command.impl;

import com.dubatovka.simplewebapp.command.PageNavigator;
import com.dubatovka.simplewebapp.entity.User;
import com.dubatovka.simplewebapp.manager.ConfigConstant;
import com.dubatovka.simplewebapp.service.ServiceFactory;
import com.dubatovka.simplewebapp.service.UserService;
import com.dubatovka.simplewebapp.command.Command;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

public class ShowUsersByCriteriaCommand implements Command {
    
    @Override
    public PageNavigator execute(HttpServletRequest request) {
        String fName = request.getParameter(ConfigConstant.PARAM_NAME);
        String lName = request.getParameter(ConfigConstant.PARAM_SURNAME);
        
        UserService userService = ServiceFactory.getInstance().getUserService();
        List<User> users = userService.getUsersByFirstAndLastName(fName, lName);
        request.setAttribute(ConfigConstant.ATTR_USERS, users);
        
        return PageNavigator.FORWARD_PAGE_USERS;
    }
}
