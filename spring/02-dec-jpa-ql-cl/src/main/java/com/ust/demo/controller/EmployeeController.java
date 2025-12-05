package com.ust.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ust.demo.model.Employee;
import com.ust.demo.service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
	@Autowired
	private EmployeeService ps;
	
	@PostMapping
	public Employee create(@RequestBody Employee employee) {
		return ps.create(employee);
	}
	
	@GetMapping
	public List<Employee> read() {
		return ps.read();
	}
	
	@GetMapping("/{id}")
	public Optional<Employee> read(@PathVariable Integer id) {
		return ps.read(id);
	}
	
	@PutMapping("/{id}")
	public Employee update(@PathVariable Integer id, @RequestBody Employee employee) {
		return ps.update(employee);
	}
	
	@DeleteMapping("/{id}")
	public String delete(@PathVariable Integer id) {
		ps.delete(id);
		return "delete'd";
	}
	
	
}
