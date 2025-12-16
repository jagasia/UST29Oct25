package com.ust.demo.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

	@GetMapping
	@PreAuthorize("hasAnyAuthority('USER','ADMIN')")
	public String home() {
		return "Welcome all";
	}
	
	@GetMapping("/about")
	@PreAuthorize("hasAuthority('ADMIN')")
	public String about() {
		return "About us";
	}
	
	@GetMapping("/contact")
	@PreAuthorize("hasAuthority('USER')")
	public String contact() {
		return "Contact us";
	}
}
