package com.ust.demo.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ust.demo.dto.UserDto;
import com.ust.demo.entity.MyUser;
import com.ust.demo.repositry.MyUserRepository;
import com.ust.demo.service.MyUserDetailsService;

@RestController
public class MyController {
	
	private final MyUserDetailsService service;
	private final AuthenticationManager am;
	
	public MyController(MyUserDetailsService service, AuthenticationManager am) {
		this.service=service;
		this.am=am;
	}
	
	@GetMapping
	@PreAuthorize("hasAnyAuthority('USER','ADMIN')")
	public String home() {
		return "Welcome all";
	}
	
	@GetMapping("/about")
	@PreAuthorize("hasAuthority('ADMIN')")
	public String about() {
		return "About us";
	}
	
	@GetMapping("/contact")
	@PreAuthorize("hasAuthority('USER')")
	public String contact() {
		return "Contact us";
	}
	
	@PostMapping("/signup")
	public MyUser signup(@RequestBody MyUser user) {
		return service.addUser(user);
	}
	
	@PostMapping("/api/login")
	public String login(@RequestBody UserDto user) {
//		return service.addUser(user);
		System.out.println(user);
		Authentication auth = am.authenticate(new UsernamePasswordAuthenticationToken(user.getUsername(), user.getPassword()));
		if(auth.isAuthenticated()) {
			//success
			return "Success";
		}else {
			//failed
			return "Failure";
		}
		
	}
}
