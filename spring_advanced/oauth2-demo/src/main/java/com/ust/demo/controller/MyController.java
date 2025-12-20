package com.ust.demo.controller;



import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

	@GetMapping
	public String home() {
		return "Hello";
	}
	
	@GetMapping("/about")
	public String about(@AuthenticationPrincipal OAuth2User user) {
		
		return "About us: "+user.getAttributes();
	}
	
	@GetMapping("/contact")
	public String contact() {
		return "Contact us";
	}
}
