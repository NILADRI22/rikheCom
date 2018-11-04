
package com.jrom.ecom.datalayer;

import com.jrom.ecom.model.AdminLogin;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Admin extends CrudRepository<com.jrom.ecom.model.AdminLogin,Integer>
{
    com.jrom.ecom.model.AdminLogin findByUNameAndPwd(String username, String password);
}
