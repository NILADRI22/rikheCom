
package com.jrom.ecom.controller;

import com.jrom.ecom.model.Orders;
import com.jrom.ecom.service.OrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.SQLException;
import java.util.List;


@RestController
public class OrdersController {
    @Autowired
    OrdersService ordersService;

    @RequestMapping("/getallorders")
    public List<Orders> getAllOrders()
            throws SQLException {
        return ordersService.getAllOrders();
    }


}

