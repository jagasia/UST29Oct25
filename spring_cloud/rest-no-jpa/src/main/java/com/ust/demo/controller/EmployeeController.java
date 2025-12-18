package com.ust.demo.controller;

import java.net.URI;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ust.demo.model.Employee;
import com.ust.demo.model.EmployeeDao;

@RestController
@RequestMapping("/api/v2/employee")
public class EmployeeController {

//	@Autowired
	private EmployeeDao edao;
	
	public EmployeeController(EmployeeDao edao) {
		this.edao=edao;
	}
	
	@PostMapping
	public ResponseEntity<Employee> create(@RequestBody Employee employee) throws Exception {
		Employee e = edao.create(employee);
		return ResponseEntity.status(HttpStatus.CREATED).body(e);
//		return new ResponseEntity<>(e,HttpStatus.CREATED);
	}
	
	@GetMapping
	public ResponseEntity<List<Employee>> read() {
		List<Employee> employees = edao.read();
		return ResponseEntity.status(200).body(employees);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Employee> read(@PathVariable("id") Long employeeId) {
		Employee temp =null;
		try {
			temp=edao.read(employeeId);
		}catch(Exception ex) {
			return ResponseEntity.status(404).build();
		}
		return ResponseEntity.status(200).body(temp);
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<Employee> update(@PathVariable Long id, @RequestBody Employee employee) throws Exception {
		Employee body = edao.update(id, employee);
		HttpStatus status = HttpStatus.OK;
		return new ResponseEntity<>(body, status);
		//ResponseEntity<Employee> x=new ResponseEntity<>(body,status);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Void> delete(@PathVariable Long id) throws Exception {
		boolean result = edao.delete(id);
		HttpStatus status = (result)?HttpStatus.NO_CONTENT:HttpStatus.NOT_FOUND;
		return new ResponseEntity<>(status);
	}
	

	
}
