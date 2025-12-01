package com.ust.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

	@GetMapping
	public String home() {
		return "Hello world";
	}
	
	@PostMapping
	public String post() {
		return "This is post";
	}
}
