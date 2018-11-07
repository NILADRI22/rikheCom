package com.jrom.ecom.controller;

import com.jrom.ecom.ErrorHandle.EComException;
import com.jrom.ecom.model.User;
import com.jrom.ecom.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

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
            throws EComException {
       log.info("UserName:"+userName);
        User userByUsernameAndPassword = loginService.getUserByUsernameAndPassword(userName, password);
        if(userByUsernameAndPassword == null)
            throw new EComException(HttpStatus.FORBIDDEN,new Throwable("unauthorised"));
        else
            return userByUsernameAndPassword;
    }

    @RequestMapping(method= RequestMethod.POST, value = "/register")
    @ResponseStatus(value = HttpStatus.CREATED)
    public User register(@RequestBody User user)
            throws SQLException
    {
        return loginService.registerUser(user);
    }
}