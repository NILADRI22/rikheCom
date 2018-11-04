package com.jrom.ecom.service;

import com.jrom.ecom.datalayer.LoginDAO;
import com.jrom.ecom.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.sql.DataSource;

@Service
public class LoginService
{
    @Autowired
    DataSource dataSource;

    @Autowired
    LoginDAO login;

    public User getUserByUsernameAndPassword(String userName, String password)
    {
       return login.findByUserNameAndPassword(userName,password);
    }

    public User registerUser(User user)
    {
        return login.save(user);
    }
}
