package com.ust.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ust.demo.model.Employee;
import com.ust.demo.repository.EmployeeRepository;

@Service
public class EmployeeService {
	@Autowired
	private EmployeeRepository pr;
	
	public Employee create(Employee employee) {
		return pr.save(employee);
	}
	public List<Employee> read() {
		return pr.findAll();
	}
	public Optional<Employee> read(Integer id) {
		return pr.findById(id);
	}
	public Employee update(Employee employee) {
		return pr.save(employee);
	}
	public void delete(Integer id) {
		pr.deleteById(id);
	}

}
