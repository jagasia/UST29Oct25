package com.ust.demo.model;

import java.util.Date;

public class Employee {
	private Long employeeId;
	private String firstName;
	private String lastName;
	private Date joinedDate;
	
	public Employee() {}
	public Employee(Long employeeId, String firstName, String lastName, Date joinedDate) {
		this.employeeId=employeeId;
		this.firstName=firstName;
		this.lastName=lastName;
		this.joinedDate=joinedDate;
	}
	
	public Long getEmployeeId() {
		return employeeId;
	}
	
	public void setEmployeeId(Long employeeId) {
		this.employeeId=employeeId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Date getJoinedDate() {
		return joinedDate;
	}
	public void setJoinedDate(Date joinedDate) {
		this.joinedDate = joinedDate;
	}
	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", joinedDate=" + joinedDate + "]";
	}
	
	public boolean equals(Object o) {
		Employee temp=(Employee) o;
		return temp.getEmployeeId().equals(this.getEmployeeId());
	}
}
