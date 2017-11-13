package com.dubatovka.simplewebapp.command;

import javax.servlet.http.HttpServletRequest;

public interface Command {
    PageNavigator execute(HttpServletRequest request);
}