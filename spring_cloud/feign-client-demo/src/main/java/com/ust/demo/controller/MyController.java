package com.ust.demo.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.ust.demo.api.EmployeeApi;
import com.ust.demo.model.Employee;

@RestController
public class MyController {

	private EmployeeApi api;
	
	public MyController(EmployeeApi api) {
		this.api=api;
	}
	
	@GetMapping
	public ResponseEntity<List<Employee>> home() {
		return api.read();
	}
	
	@GetMapping("/{employeeId}")
	public ResponseEntity<Employee> findEmployeeById(@PathVariable("employeeId") Long id) {
//		ResponseEntity<Employee> res = api.read(id);
//		if(res.getStatusCode().is4xxClientError()) {
//			return "Not found";
//		}else {
//			return "found"+res.getBody().toString();
//		}
		System.out.println("We are going to use rest template now");
		RestTemplate rt=new RestTemplate();
		ResponseEntity<Employee> res = rt.getForEntity("http://localhost:8081/api/v2/employee/"+id, Employee.class);
		return res;
	}
}
