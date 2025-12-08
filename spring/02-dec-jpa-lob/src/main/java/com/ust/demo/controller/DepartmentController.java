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

import com.ust.demo.model.Department;
import com.ust.demo.service.DepartmentService;

@RestController
@RequestMapping("/department")
public class DepartmentController {
	@Autowired
	private DepartmentService ps;
	
	@PostMapping
	public Department create(@RequestBody Department department) {
		return ps.create(department);
	}
	
	@GetMapping
	public List<Department> read() {
		return ps.read();
	}
	
	@GetMapping("/{id}")
	public Optional<Department> read(@PathVariable Integer id) {
		return ps.read(id);
	}
	
	@PutMapping("/{id}")
	public Department update(@PathVariable Integer id, @RequestBody Department department) {
		return ps.update(department);
	}
	
	@DeleteMapping("/{id}")
	public String delete(@PathVariable Integer id) {
		ps.delete(id);
		return "delete'd";
	}
	
	
}
