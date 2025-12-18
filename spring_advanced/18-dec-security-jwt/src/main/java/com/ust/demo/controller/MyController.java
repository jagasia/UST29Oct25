package com.ust.demo.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ust.demo.dto.ResponseDto;
import com.ust.demo.dto.UserDto;
import com.ust.demo.entity.MyUser;
import com.ust.demo.repositry.MyUserRepository;
import com.ust.demo.service.JwtService;
import com.ust.demo.service.MyUserDetailsService;

@RestController
public class MyController {
	
	private final MyUserDetailsService service;
	private final AuthenticationManager am;
	private JwtService jwtService;
	
	public MyController(MyUserDetailsService service, AuthenticationManager am, JwtService jwtService) {
		this.service=service;
		this.am=am;
		this.jwtService=jwtService;
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
	public ResponseDto login(@RequestBody UserDto user) {
//		return service.addUser(user);
		System.out.println(user);
		Authentication auth = am.authenticate(new UsernamePasswordAuthenticationToken(user.getUsername(), user.getPassword()));
		if(auth.isAuthenticated()) {
			//success. so, generate jwt token and return
			String token = jwtService.generateToken(user.getUsername());
			ResponseDto response=new ResponseDto();
			response.setUsername(user.getUsername());
			response.setToken(token);
			//get roles
			String roles="";
			boolean isFirst=true;
			for(GrantedAuthority authority:auth.getAuthorities()) {
				if(!isFirst)
					roles+=",";
				roles+=authority.getAuthority();
				isFirst=false;
			}
			response.setRoles(roles);
			return response;
		}else {
			//failed
			throw new UsernameNotFoundException("Login failed");
		}
		
	}
}
