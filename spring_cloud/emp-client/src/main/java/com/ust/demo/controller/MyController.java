package com.ust.demo.controller;

import org.jspecify.annotations.Nullable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Fallback;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;

@RestController
public class MyController {
	@Autowired
	private RestTemplate rt;

	@GetMapping
	@CircuitBreaker(name = "cb1", fallbackMethod = "fallbackMethod")
	public String home() {
		@Nullable
		String res = rt.getForObject("http://localhost:5000/api/v2/employee", String.class);
		
		return "This is emp client home. The response received: "+res;
	}
	
	@Fallback
	public String fallbackMethod(Throwable t) {
		return "This is fallback method...";
	}
}
