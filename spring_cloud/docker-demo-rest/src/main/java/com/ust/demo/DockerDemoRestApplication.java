package com.ust.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DockerDemoRestApplication {
	
	@GetMapping
	public String home() {
		return "Hello world";
	}

	public static void main(String[] args) {
		SpringApplication.run(DockerDemoRestApplication.class, args);
	}

}
