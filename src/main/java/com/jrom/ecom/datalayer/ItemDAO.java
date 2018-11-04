package com.jrom.ecom.datalayer;

import org.springframework.data.repository.CrudRepository;

public interface ItemDAO extends CrudRepository<com.jrom.ecom.model.Item,Integer>
{

}
