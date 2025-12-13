package com.ust.demo.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

	@GetMapping
	public String home() {
		return "Welcome home";
	}
	
	@GetMapping("/about")
	@PreAuthorize("hasRole('USER')")
	public String about() {
		return "About us";
	}
	
	
	@GetMapping("/contact")
	@PreAuthorize("hasRole('ADMIN')")
	public String contact() {
		return "Contact us";
	}
}
