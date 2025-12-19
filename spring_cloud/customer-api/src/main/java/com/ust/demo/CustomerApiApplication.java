package com.ust.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class CustomerApiApplication {
	
	@GetMapping("/customer")
	public String home() {
		return "Hi, this is customer api";
	}

	public static void main(String[] args) {
		SpringApplication.run(CustomerApiApplication.class, args);
	}

}
