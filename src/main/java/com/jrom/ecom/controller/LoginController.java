package com.jrom.ecom.controller;

import com.jrom.ecom.model.User;
import com.jrom.ecom.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.soap.Name;
import java.sql.SQLException;
import java.util.logging.Logger;

@RestController
public class LoginController {
    @Autowired
    LoginService loginService;

    private static Logger log = Logger.getLogger(LoginController.class.getName());

    @RequestMapping("/login")
    public User login(@RequestParam(value = "_username") String userName,
                      @RequestParam(value = "password") String password)
            throws SQLException
    {
       log.info("UserName:"+userName);
        return loginService.getUserByUsernameAndPassword(userName,password);
	}

    @RequestMapping(method= RequestMethod.POST, value = "/register")
    public User register(
                            @RequestParam(value = "_username") String userName,
                            @RequestParam(value = "password") String password,
                            @RequestParam(value="name") String name,
                            @RequestParam(value="email") String email,
                            @RequestParam(value="address1") String address1,
                            @RequestParam(value="address2") String address2
                         )
            throws SQLException
    {
        return loginService.registerUser(userName,password,name,email,address1,address2);
    }
}