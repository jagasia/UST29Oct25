package com.ust.demo.service;

import java.util.Map;
import java.util.TreeMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class MyUserDetailsService implements UserDetailsService
{
	private Map<String, UserDetails> userMap=new TreeMap<>();	
	
	private PasswordEncoder encoder;
	
	public MyUserDetailsService(PasswordEncoder encoder) {
		UserDetails u1 = User.withUsername("jobin")
				.password(encoder.encode("jobin@123"))
				.roles("ADMIN")
				.build();
				 
				 UserDetails u2 = User.withUsername("nithin")
							.password(encoder.encode("nithin@123"))
							.roles("USER")
							.build();
				 
				 UserDetails u3 = User.withUsername("sarat")
							.password(encoder.encode("sarat@123"))
							.roles("ADMIN","USER")
							.build();
				 userMap.put(u1.getUsername(), u1);
				 userMap.put(u2.getUsername(), u2);
				 userMap.put(u3.getUsername(), u3);
				 
	}
	

	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		 
		 UserDetails user = userMap.get(username);
		 if(user==null)
			 throw new UsernameNotFoundException("Login failed!");
		return user;
	}

	
}
