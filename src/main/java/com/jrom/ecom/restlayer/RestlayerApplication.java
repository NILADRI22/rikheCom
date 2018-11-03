package com.jrom.ecom.restlayer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import javax.sql.DataSource;

@SpringBootApplication
@EnableJpaRepositories({"com.jrom.ecom.datalayer"})
@ComponentScan({"com.jrom.ecom","com.jrom.ecom.controller","com.jrom.ecom.service","com.jrom.ecom.model,com.jrom.ecom.configuration"})
@EntityScan("com.jrom.ecom.*")
public class RestlayerApplication
{

	public static void main(String[] args) {
		SpringApplication.run(RestlayerApplication.class, args);
	}
}
