/**
 *
 */
package com.jrom.ecom.model;

import javax.persistence.*;

import org.springframework.beans.factory.annotation.Autowired;

import com.jrom.ecom.datalayer.Login;

/**
 * @author saumadip
 */
@Entity
public class User
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")
    private int id;
    private String password;
    private String userName;
    private String name;
    private String email;
    private String address1;
    private String address2;

    public User() {
    }

    public User(String password, String userName, String name, String email, String address1) {
        this.password = password;
        this.userName = userName;
        this.name = name;
        this.email = email;
        this.address1 = address1;
    }

    public User(String password, String userName, String name, String email, String address1, String address2) {
        this.password = password;
        this.userName = userName;
        this.name = name;
        this.email = email;
        this.address1 = address1;
        this.address2 = address2;
    }

    public User(String password, String userName, String name) {
        this.password = password;
        this.userName = userName;
        this.name = name;
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

    public String getAddress1() {
        return address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }


}
