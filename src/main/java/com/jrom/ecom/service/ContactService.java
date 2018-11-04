package com.jrom.ecom.service;


import com.jrom.ecom.datalayer.Contact;
import com.jrom.ecom.model.ContactUs;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.sql.DataSource;


    @Service
    public class ContactService {

        @Autowired
        DataSource dataSource;

        @Autowired
        Contact contact;

        public com.jrom.ecom.model.ContactUs getContactById (Integer id)
        {
            return contact.findById(id).get();
        }

        public com.jrom.ecom.model.ContactUs  postContact ( Integer id,String name, String email, String msg)
        {
            return contact.save(new com.jrom.ecom.model.ContactUs(id, name, email, msg));
        }
    }

