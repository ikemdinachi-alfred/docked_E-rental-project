package com.alfredTech.e_rental_application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ERentalApplication {
	@PostMapping("helloWorld")
	public String sayHello(){
		return "Hello World world";

	}

	public static void main(String[] args) {
		SpringApplication.run(ERentalApplication.class, args);
	}

}
