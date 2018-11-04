package com.jrom.ecom.model;

import javax.persistence.*;
import java.math.BigInteger;
import java.util.List;

@Entity
public class Billing {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "bill_id")
    private int billID;
    private BigInteger phone;
    private BigInteger fax;
    private String company;
    private String city;
    private int pinCode;
    private String comments;
    @OneToMany
    private List<Orders> orders;


    public Billing(BigInteger phone, BigInteger fax, String company, String city, int pincode, String comments) {

    }

    public Billing(int billID, BigInteger phone, BigInteger fax, String company, String city, int pinCode, String comments) {
        this.billID = billID;
        this.phone = phone;
        this.fax = fax;
        this.company = company;
        this.city = city;
        this.pinCode = pinCode;
        this.comments = comments;
    }

    public int getBillID() {
        return billID;
    }

    public void setBillID(int billID) {
        this.billID = billID;
    }

    public BigInteger getPhone(BigInteger phone) {
        return phone;
    }

    public void setPhone(BigInteger phone) {
        this.phone = phone;
    }

    public BigInteger getFax(BigInteger fax) {
        return fax;
    }

    public void setFax(BigInteger fax) {
        this.fax = fax;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getPinCode() {
        return pinCode;
    }

    public void setPinCode(int pinCode) {
        this.pinCode = pinCode;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }


    public List<Orders> getOrders() {
        return orders;
    }

    public void setOrders(List<Orders> orders) {
        this.orders = orders;
    }
}