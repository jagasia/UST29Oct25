package com.ust.demo.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Vehicle {
	@Value("123")
	private Integer id;
	@Value("Thar")
	private String name;
	private String color;
	
	public Vehicle() {}

	public Vehicle(Integer id) {
		super();
		this.id = id;
	}

	
	public Vehicle(Integer id, String name, String color) {
		super();
		this.id = id;
		this.name = name;
		this.color = color;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Vehicle [id=" + id + ", name=" + name + ", color=" + color + "]";
	}
	
	
}
