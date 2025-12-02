package com.ust.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ust.demo.model.Department;
import com.ust.demo.repository.DepartmentRepository;

@Service
public class DepartmentService {
	@Autowired
	private DepartmentRepository pr;
	
	public Department create(Department department) {
		return pr.save(department);
	}
	public List<Department> read() {
		return pr.findAll();
	}
	public Optional<Department> read(Integer id) {
		return pr.findById(id);
	}
	public Department update(Department department) {
		return pr.save(department);
	}
	public void delete(Integer id) {
		pr.deleteById(id);
	}

}
