package com.ust.demo.api;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.ust.demo.model.Employee;

@FeignClient(name = "niraj-api",url = "http://localhost:8081/api/v2/employee")
public interface EmployeeApi {

	@PostMapping
	public ResponseEntity<Employee> create(@RequestBody Employee employee) throws Exception;
	
	@GetMapping
	public ResponseEntity<List<Employee>> read();
	
	@GetMapping("/{id}")
	public ResponseEntity<Employee> read(@PathVariable("id") Long employeeId);
	
	@PutMapping("/{id}")
	public ResponseEntity<Employee> update(@PathVariable Long id, @RequestBody Employee employee) throws Exception;
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Void> delete(@PathVariable Long id) throws Exception;
}
