package com.jrom.ecom.service;

import com.jrom.ecom.datalayer.ItemDAO;
import com.jrom.ecom.model.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ItemService
{
    @Autowired
    ItemDAO itemDAODatalayer;

    public List<com.jrom.ecom.model.Item> getAllItem()
    {
        List<Item> itemList = new ArrayList<>();
        Iterable<Item> items = itemDAODatalayer.findAll();
        for(Item item : items)
        {
            itemList.add(item);
        }
        return itemList;
    }
}
