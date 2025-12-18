package com.ust.demo.model;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class EmployeeDaoImpl implements EmployeeDao {
	
	private List<Employee> employees;
	
	public EmployeeDaoImpl() {
		employees=new ArrayList<>();
	}
	
	@Override
	public Employee create(Employee employee) throws Exception {
		if(employee.getEmployeeId()==null)
			throw new Exception("Id is mandatory");
		boolean isAdded = employees.add(employee);
		if(!isAdded)
			throw new Exception("Error while adding employee");
		return employee;
	}
	
	@Override
	public List<Employee> read() {
		return employees;
	}
	
	@Override
	public Employee read(Long employeeId) throws Exception {
		//find if employeeId is there in the list
		boolean isFound=false;
		Employee temp=new Employee();
		temp.setEmployeeId(employeeId);
		
		if(employees.contains(temp)) {
			for(Employee e:employees) {
//				if(e.equals(temp))
				if(e.getEmployeeId().equals(employeeId)) {
					return e;
				}
			}
		}else {
			throw new Exception("No employee with employee id: "+employeeId);
		}
		return null;
	}
	@Override
	public Employee update(Long employeeId, Employee employee) throws Exception {
		Employee temp = read(employeeId);
		temp.setFirstName(employee.getFirstName());
		temp.setLastName(employee.getLastName());
		temp.setJoinedDate(employee.getJoinedDate());		
		return temp;
	}
	@Override
	public boolean delete(Long employeeId) throws Exception {
		Employee temp = read(employeeId);
		return employees.remove(temp);
		
	}
	
	
}
