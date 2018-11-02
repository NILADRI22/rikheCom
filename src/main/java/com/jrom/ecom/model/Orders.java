package com.jrom.ecom.model;


import javax.persistence.*;

@Entity
public class Orders {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="order_no")
    private int orderNo;
    private String pName;
    private String unitPrice;
    private int qty;
    private String orderDate;
    private String orderTime;
    private int userId;

    public Orders() {
    }

    public Orders(int orderNo, String pName, String unitPrice, int qty, String orderDate, String orderTime, int userId) {
        this.orderNo = orderNo;
        this.pName = pName;
        this.unitPrice = unitPrice;
        this.qty = qty;
        this.orderDate = orderDate;
        this.orderTime = orderTime;
        this.userId = userId;
    }


    public int getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(int orderNo) {
        this.orderNo = orderNo;
    }
    public String getPName() {
        return pName;
    }

    public void setPName(String pName) {
        this.pName = pName;
    }
    public String getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(String unitPrice) {
        this.unitPrice = unitPrice;
    }
    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }
    public String getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }
    public String getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(String orderTime) {
        this.orderTime = orderTime;
    }
    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }


}