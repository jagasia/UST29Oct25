package com.ust.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import jakarta.websocket.server.PathParam;

@SpringBootApplication
@RestController
public class Application {

	@RequestMapping(method = RequestMethod.GET,value = "/add", produces = "application/json", consumes = "application/json")
//	http://localhost:8085/?no1=2&no2=3
//	http://localhost:8085/add?no1=2&no2=3
	public Integer add(@RequestParam("no1") Integer no1,@RequestParam("no2") Integer no2) {
		return no1+no2;
	}
	
	@GetMapping("/multiply/{no1}/{no2}")
//	http://localhost:8085/multiply/2/3
	public Integer multiple(@PathVariable Integer no1,@PathVariable("no2") Integer no2) {
		return no1*no2;
	}
	
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		System.out.println("Hello Jag");
	}

}
