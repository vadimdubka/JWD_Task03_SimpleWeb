package com.dubatovka.simplewebapp.service;

import com.dubatovka.simplewebapp.entity.User;

import java.util.List;

public interface UserService {
    
    List<User> getAllUsers();
    
    List<User> getUsersByFirstAndLastName(String fName, String lName);
}
