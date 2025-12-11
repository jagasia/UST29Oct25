package com.ust.demo.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Department {
	@Id
	@GeneratedValue
	private Integer id;
	private String name;
	@OneToMany(mappedBy = "department",fetch = FetchType.LAZY)
//	@JsonIgnore
	private List<Employee> employeeList;
}
