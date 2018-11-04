package com.jrom.ecom.model;

import javax.persistence.*;


@Entity
public class ContactUs {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")
    private Integer id;
    private String name;
    private String email;
    private String msg;


    public ContactUs( Integer id,String name, String email, String msg) {
        this.id=id;
        this.name = name;
        this.email = email;
        this.msg = msg;

    }
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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
