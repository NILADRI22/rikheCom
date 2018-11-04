package com.jrom.ecom.service;


import com.jrom.ecom.datalayer.ContactDAO;
import com.jrom.ecom.model.ContactUs;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.sql.DataSource;


    @Service
    public class ContactService {

        @Autowired
        DataSource dataSource;

        @Autowired
        ContactDAO contactDAO;

        public ContactUs getContactById (Integer id)
        {
            return contactDAO.findById(id).get();
        }

        public ContactUs  postContact ( Integer id,String name, String email, String msg)
        {
            return contactDAO.save(new ContactUs(id, name, email, msg));
        }
    }

