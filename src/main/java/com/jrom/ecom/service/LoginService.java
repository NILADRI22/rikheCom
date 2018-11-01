package com.jrom.ecom.service;

import com.jrom.ecom.datalayer.Login;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.sql.DataSource;

@Service
public class LoginService
{
    @Autowired
    DataSource dataSource;

    @Autowired
    Login login;

    public DataSource getDatasource()
    {
       return dataSource;
    }
}
