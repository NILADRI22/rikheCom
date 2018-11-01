package com.jrom.ecom.restservice;

import org.springframework.beans.factory.annotation.Autowired;

import com.jrom.ecom.datalayer.Login;
import com.jrom.ecom.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class LoginService
{
	@RequestMapping("/login")
	public User login(String userName, String password) {
		return new User("test","test","test");
	}

	@GetMapping("/hello")
    @ResponseBody
	public String test() {
		return "hello ";
	}
}