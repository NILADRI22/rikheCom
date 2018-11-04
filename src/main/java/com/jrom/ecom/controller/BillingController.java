package com.jrom.ecom.controller;
import com.jrom.ecom.model.Billing;
import com.jrom.ecom.service.BillingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigInteger;
import java.sql.SQLException;
import java.util.logging.Logger;


@RestController
public class BillingController {

    @Autowired
    BillingService billingService;

    private static Logger log = Logger.getLogger(ContactUsController.class.getName());

    @RequestMapping("/billinginfo")
    public Billing get(@RequestParam(value = "_billId") Integer billId)
            throws SQLException {
        log.info("BillId:" + billId);
        return billingService.getBillingByBillId(billId);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/billinginfo")
    public Billing post(
            @RequestParam(value = "phone") BigInteger phone,
            @RequestParam(value = "fax") BigInteger fax,
            @RequestParam(value = "company") String company,
            @RequestParam(value = "city") String city,
            @RequestParam(value = "pincode") Integer pincode,
            @RequestParam(value = "comments") String comments
    )
            throws SQLException {
        return  billingService.billingInfo(phone, fax, company, city, pincode, comments);

    }
}


