package com.ust.demo.dto;

public class ResponseDto {
	private String username;
	private String token;
	private String roles;
	
	public ResponseDto() {}

	public ResponseDto(String username, String token, String roles) {
		super();
		this.username = username;
		this.token = token;
		this.roles = roles;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public String getRoles() {
		return roles;
	}

	public void setRoles(String roles) {
		this.roles = roles;
	}
	
	
}
