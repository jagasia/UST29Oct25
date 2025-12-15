package com.ust.demo.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

	@GetMapping
	@PreAuthorize("hasAnyRole('USER','ADMIN')")
	public String home() {
		return "Welcome all";
	}
	
	@GetMapping("/about")
	@PreAuthorize("hasRole('ADMIN')")
	public String about() {
		return "About us";
	}
	
	@GetMapping("/contact")
	@PreAuthorize("hasRole('USER')")
	public String contact() {
		return "Contact us";
	}
}
