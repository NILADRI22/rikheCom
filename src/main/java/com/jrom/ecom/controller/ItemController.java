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
import java.util.logging.Logger;

@RestController
public class ItemController
{
    @Autowired
    ItemService itemService;
    private static Logger log = Logger.getLogger(ItemController.class.getName());
    @RequestMapping("/getallItems")
    public List<Item> getAllItems  ()
            throws SQLException
    {
        log.info("geting itms");
        return itemService.getAllItem();
    }
}
