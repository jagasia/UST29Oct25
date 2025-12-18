package com.ust.demo.model;

import java.util.List;

public interface EmployeeDao {

	Employee create(Employee employee) throws Exception;

	List<Employee> read();

	Employee read(Long employeeId) throws Exception;

	Employee update(Long employeeId, Employee employee) throws Exception;

	boolean delete(Long employeeId) throws Exception;

}