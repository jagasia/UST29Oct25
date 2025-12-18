package com.ust.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;

@RestController
public class MyController {

	@Autowired
	@LoadBalanced
	private RestTemplate rt;

	@GetMapping("/{id}")
	@CircuitBreaker(name = "jag", fallbackMethod = "fallbackMethod")
	public String home(@PathVariable Integer id)
	{
		//call rest api 1 and get the response.
		Employee res=null;
		res=rt.getForObject("http://localhost:8081/"+id, Employee.class);
		return res.getName();
	}
		
	public String fallbackMethod(Throwable throwable)
	{
		return "This is fallbakc method";
	}
}
