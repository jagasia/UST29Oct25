package com.ust.demo.config;

import java.util.ArrayList;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.User.UserBuilder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
public class MyConfiguration {


	@Bean
	public UserDetailsService userDetailsService() {
		User u1=new User("jag", "jag", null);
		User u2=new User("raja","raja",null);
		return new InMemoryUserDetailsManager(u1, u2);
	}
	
	@Bean
	public PasswordEncoder passwordEncoder() {
		return NoOpPasswordEncoder.getInstance();
	}
	
	@Bean
	public AuthenticationProvider ap() {
        DaoAuthenticationProvider ap = new DaoAuthenticationProvider(userDetailsService());
		ap.setPasswordEncoder(passwordEncoder());
		return ap;
	}
}
