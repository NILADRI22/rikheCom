package com.jrom.ecom.datalayer;

import com.jrom.ecom.model.User;
import org.springframework.data.repository.CrudRepository;

public interface Login extends CrudRepository<User,Integer>
{
	
}
