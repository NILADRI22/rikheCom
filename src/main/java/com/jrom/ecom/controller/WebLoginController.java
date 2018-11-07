package com.jrom.ecom.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.stream.Collectors;

@Controller
@RequestMapping("/web")
public class WebLoginController
{
    @Value("${spring.application.name}")
    String appName;

    @RequestMapping("/getregisterform")
    public String register(Model model) throws IOException
    {
        return "register";

    }

    @RequestMapping("/getloginform")
    public String login(Model model) throws IOException
    {
        return "login";

    }

    @RequestMapping("/getitem")
    public String getItem(Model model) throws IOException
    {
        return "item";

    }

    @RequestMapping("/submitregisterform")
    public String register(HttpServletRequest request) throws IOException
    {
        String data = request.getReader().lines().collect(Collectors.joining(System.lineSeparator()));
        return "redirect:/register/"+data;
    }
}
