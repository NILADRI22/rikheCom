package com.jrom.ecom.service;

import com.jrom.ecom.datalayer.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ItemService
{
    @Autowired
    Item itemDatalayer;

    public List<com.jrom.ecom.model.Item> getAllItem()
    {
        List<com.jrom.ecom.model.Item> itemList = new ArrayList<>();
        Iterable<com.jrom.ecom.model.Item> items = itemDatalayer.findAll();
        for(com.jrom.ecom.model.Item item : items)
        {
            itemList.add(item);
        }
        return itemList;
    }
}
