
package com.jrom.ecom.service;

import com.jrom.ecom.datalayer.AdminDAO;
import com.jrom.ecom.model.AdminLogin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.sql.DataSource;

@Service
public class AdminLoginService {
    @Autowired
    DataSource dataSource;

    @Autowired
    AdminDAO login;

    public AdminLogin getUserByUsernameAndPassword(String userName, String password) {
        return login.findByUNameAndPwd(userName, password);
    }
}