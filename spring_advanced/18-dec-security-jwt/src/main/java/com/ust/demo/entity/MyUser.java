package com.ust.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class MyUser
{
	@Id
	private String username;
	private String password;
	private String authorities;	//ex:		USER,ADMIN
	
	public MyUser() {}

	public MyUser(String username, String password, String authorities) {
		super();
		this.username = username;
		this.password = password;
		this.authorities = authorities;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getauthorities() {
		return authorities;
	}

	public void setauthorities(String authorities) {
		this.authorities = authorities;
	}

	@Override
	public String toString() {
		return "MyUser [username=" + username + ", password=" + password + ", authorities=" + authorities + "]";
	}
	
	


}
