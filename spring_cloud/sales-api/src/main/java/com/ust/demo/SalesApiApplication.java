package com.ust.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SalesApiApplication {
	
	@GetMapping("/sales")
	public String home() {
		return "This is sales api";
	}

	public static void main(String[] args) {
		SpringApplication.run(SalesApiApplication.class, args);
	}

}
