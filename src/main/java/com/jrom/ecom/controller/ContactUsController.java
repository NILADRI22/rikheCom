package com.jrom.ecom.controller;

import com.jrom.ecom.model.ContactUs;
import com.jrom.ecom.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.soap.Name;
import java.sql.SQLException;
import java.util.logging.Logger;


@RestController
public class ContactUsController {


    @Autowired
    ContactService contactService;

    private static Logger log = Logger.getLogger(ContactUsController.class.getName());

    @RequestMapping("/contactinfo")
    public ContactUs get(@RequestParam(value = "_id") Integer id)
            throws SQLException {
        log.info("Id:" + id);
        return contactService.getContactById(id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/contactinfo")
    public ContactUs post(
            @RequestParam(value = "id") Integer id,
            @RequestParam(value = "name") String name,
            @RequestParam(value = "email") String email,
            @RequestParam(value = "msg") String msg
    )
            throws SQLException {
        return contactService.postContact(id,name, email, msg);

    }
}
