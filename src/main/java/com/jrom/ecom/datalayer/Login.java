package com.jrom.ecom.datalayer;

import com.jrom.ecom.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Login extends CrudRepository<User,Integer>
{
	User findByUserNameAndPassword(String username, String password);
}
