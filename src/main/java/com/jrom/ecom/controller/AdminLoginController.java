
package com.jrom.ecom.controller;

import com.jrom.ecom.model.AdminLogin;
import com.jrom.ecom.service.AdminLoginService;
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
public class AdminLoginController {
    @Autowired
    AdminLoginService loginService;

    private static Logger log = Logger.getLogger(LoginController.class.getName());

    @RequestMapping("/adminlogin")
    public AdminLogin login(@RequestParam(value = "_username") String userName,
                            @RequestParam(value = "password") String password)
            throws SQLException {
        log.info("UserName:" + userName);
        return loginService.getUserByUsernameAndPassword(userName, password);
    }

}
