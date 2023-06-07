package com.assigment2_748.inventory_management_system_748;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
@EntityScan
public class InventoryManagementSystem748Application {

	public static void main(String[] args) {
		SpringApplication.run(InventoryManagementSystem748Application.class, args);
	}

}
