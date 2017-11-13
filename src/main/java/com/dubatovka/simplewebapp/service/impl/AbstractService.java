package com.dubatovka.simplewebapp.service.impl;

import com.dubatovka.simplewebapp.dao.DAOFactory;

abstract class AbstractService {
    
    DAOFactory daoFactory;
    
    AbstractService() {
        this.daoFactory = DAOFactory.getInstance();
    }
    
}