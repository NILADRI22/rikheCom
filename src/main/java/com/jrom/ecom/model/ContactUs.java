package com.jrom.ecom.model;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class ContactUs {

    @Id
    private String name;
    private String email;
    private String msg;


    public ContactUs(String name, String email, String msg) {
        this.name = name;
        this.email = email;
        this.msg = msg;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }


}
