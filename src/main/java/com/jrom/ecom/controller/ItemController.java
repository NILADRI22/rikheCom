package com.jrom.ecom.controller;

import com.jrom.ecom.model.Item;
import com.jrom.ecom.model.User;
import com.jrom.ecom.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.sql.SQLException;
import java.util.List;

@RestController
public class ItemController
{
    @Autowired
    ItemService itemService;

    @RequestMapping("/getallItems")
    public List<Item> getAllItems  ()
            throws SQLException
    {
        return itemService.getAllItem();
    }
}
