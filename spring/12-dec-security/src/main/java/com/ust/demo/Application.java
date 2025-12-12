package com.ust.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Application {

	@GetMapping
	public String home() {
		return "hello world";
	}
	
	@GetMapping("/about")
	public String aboutUs() {
		return "about us";
	}
	
	@GetMapping("/contact")
	public String contactUs() {
		return "Contact us";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
