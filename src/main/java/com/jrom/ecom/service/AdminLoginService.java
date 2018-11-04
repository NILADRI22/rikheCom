
package com.jrom.ecom.service;

import com.jrom.ecom.datalayer.Admin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.sql.DataSource;

@Service
public class AdminLoginService {
    @Autowired
    DataSource dataSource;

    @Autowired
    Admin login;

    public com.jrom.ecom.model.AdminLogin getUserByUsernameAndPassword(String userName, String password) {
        return login.findByUNameAndPwd(userName, password);
    }
}