package com.ust.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class MyController {
//	@Autowired
	private RestTemplate rt;
	
	public MyController(RestTemplate rt) {
		this.rt=rt;
	}
	
	@GetMapping
	public String home() {
		//call http://localhost:8086/product2
//		RestTemplate rt=new RestTemplate();
		String response=rt.getForObject("http://localhost:8086/product2", String.class);
		return "Hello we got response as: "+response;
	}
}
