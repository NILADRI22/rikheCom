package com.jrom.ecom.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Billing
{
    @Id
    private int iD;
    private String f_name;
    private String l_name;
    private String email;
    private String phone;
    private String fax;
    private String company;
    private String c_id;
    private String add1;
    private String add2;
    private String city;
    private String p_code;
    private String comments;

    public Billing(String f_name, String l_name, String email, String phone, String fax, String company, String c_id, String add1, String add2, String city, String p_code, String comments) {
        this.f_name = f_name;
        this.l_name = l_name;
        this.email = email;
        this.phone = phone;
        this.fax = fax;
        this.company = company;
        this.c_id = c_id;
        this.add1 = add1;
        this.add2 = add2;
        this.city = city;
        this.p_code = p_code;
        this.comments = comments;
    }

    public int getiD() {
        return iD;
    }

    public void setiD(int iD) {
        this.iD = iD;
    }

    public String getF_name() {
        return f_name;
    }

    public void setF_name(String f_name) {
        this.f_name = f_name;
    }

    public String getL_name() {
        return l_name;
    }

    public void setL_name(String l_name) {
        this.l_name = l_name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getC_id() {
        return c_id;
    }

    public void setC_id(String c_id) {
        this.c_id = c_id;
    }

    public String getAdd1() {
        return add1;
    }

    public void setAdd1(String add1) {
        this.add1 = add1;
    }

    public String getAdd2() {
        return add2;
    }

    public void setAdd2(String add2) {
        this.add2 = add2;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getP_code() {
        return p_code;
    }

    public void setP_code(String p_code) {
        this.p_code = p_code;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }
}
