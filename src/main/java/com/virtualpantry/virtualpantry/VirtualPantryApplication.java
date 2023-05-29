package com.virtualpantry.virtualpantry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("api/v1/household-users")
public class VirtualPantryApplication {

	public static void main(String[] args) {
		SpringApplication.run(VirtualPantryApplication.class, args);
	}

}
