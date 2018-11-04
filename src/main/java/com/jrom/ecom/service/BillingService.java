package com.jrom.ecom.service;



import com.jrom.ecom.datalayer.Billing;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.sql.DataSource;
import java.math.BigInteger;

@Service


public class BillingService {

    @Autowired
    DataSource dataSource;

    @Autowired
    Billing billing;

    public com.jrom.ecom.model.Billing getBillingByBillId(int billID)
    {
        return billing.findById(billID).get();
    }


    public com.jrom.ecom.model.Billing billingInfo(BigInteger phone, BigInteger fax, String company, String city, int pincode, String comments) {
        return billing.save(new com.jrom.ecom.model.Billing(phone, fax, company, city, pincode, comments));
    }

}