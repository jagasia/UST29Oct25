package com.ust.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	@Value("${name}")
	private String name;
	
	@Value("${company-name}")
	private String companyName;

	@GetMapping
	public String home() {
		return "Hello "+name+"<br/>You work for "+companyName;
	}
}
