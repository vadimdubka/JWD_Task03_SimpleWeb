package com.dubatovka.simplewebapp.controller.command.impl;

import com.dubatovka.simplewebapp.service.ServiceFactory;
import com.dubatovka.simplewebapp.controller.command.Command;
import com.dubatovka.simplewebapp.controller.command.PageNavigator;
import com.dubatovka.simplewebapp.entity.User;
import com.dubatovka.simplewebapp.service.UserService;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

import static com.dubatovka.simplewebapp.controller.ConfigConstant.ATTR_USERS;

public class ShowAllUsersCommand implements Command {
    @Override
    public PageNavigator execute(HttpServletRequest request) {
        UserService userService = ServiceFactory.getInstance().getUserService();
        List<User> users = userService.getAllUsers();
        request.setAttribute(ATTR_USERS, users);
    
        return PageNavigator.FORWARD_PAGE_USERS;
    }
}
