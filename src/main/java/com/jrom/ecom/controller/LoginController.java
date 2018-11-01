package com.jrom.ecom.controller;

import com.jrom.ecom.model.User;
import com.jrom.ecom.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.SQLException;

@RestController
public class LoginController
{
    @Autowired
    LoginService loginService;

	@RequestMapping("/login")
	public User login(String userName, String password) throws SQLException {
        return new User(loginService.getDatasource().getConnection().toString(),"test","test");
	}
}