package com.jrom.ecom.service;



import com.jrom.ecom.datalayer.BillingDAO;
import com.jrom.ecom.model.Billing;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.sql.DataSource;
import java.math.BigInteger;

@Service


public class BillingService {

    @Autowired
    DataSource dataSource;

    @Autowired
    BillingDAO billingDAO;

    public Billing getBillingByBillId(int billID)
    {
        return billingDAO.findById(billID).get();
    }


    public com.jrom.ecom.model.Billing billingInfo(BigInteger phone, BigInteger fax, String company, String city, int pincode, String comments) {
        return billingDAO.save(new Billing(phone, fax, company, city, pincode, comments));
    }

}