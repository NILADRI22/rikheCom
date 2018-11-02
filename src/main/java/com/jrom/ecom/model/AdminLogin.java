package com.jrom.ecom.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class AdminLogin {

    @Id
    private String uName;
    private String pwd;


    public AdminLogin(String uName, String pwd) {
        this.uName = uName;
        this.pwd = pwd;

    }

    public String getuName() {
        return uName;
    }

    public void setuName(String uName) {
        this.uName = uName;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }
}