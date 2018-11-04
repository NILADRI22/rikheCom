package com.jrom.ecom.datalayer;


import com.jrom.ecom.model.ContactUs;
import org.springframework.data.repository.CrudRepository;

public interface OrdersDAO extends CrudRepository<com.jrom.ecom.model.Orders,Integer> {

}
