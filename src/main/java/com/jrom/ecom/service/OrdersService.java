

package com.jrom.ecom.service;

import com.jrom.ecom.datalayer.OrdersDAO;
import com.jrom.ecom.model.Orders;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class OrdersService
{
    @Autowired
    OrdersDAO orderDatalayer;

    public List<Orders> getAllOrders()
    {
        List<Orders> ordersList = new ArrayList<>();
        Iterable<Orders> orders = orderDatalayer.findAll();
        for(Orders order: orders)
        {
            getAllOrders();
        }
        return ordersList;
    }


}

