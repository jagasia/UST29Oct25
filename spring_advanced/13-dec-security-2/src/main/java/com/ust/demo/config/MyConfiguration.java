package com.ust.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
@EnableMethodSecurity
public class MyConfiguration {

	//password encoder
	//user details service
	//authentication provider
	
	@Bean
	public PasswordEncoder passwordEncoder() {
		return NoOpPasswordEncoder.getInstance();
	}
	
	@Bean
	public UserDetailsService userDetailsService(PasswordEncoder passwordEncoder) {
//		User u1=new User("arun", "arun@123", new ArrayList<>());
//		User u2=new User("aswin", "aswin@123", new ArrayList<>());
//		User u3=new User("gokul", "gokul@123", new ArrayList<>());
		
		UserDetails u1 = User.withUsername("arun")
		.password("arun@123")
		.roles("USER").build();
		
		UserDetails u2 = User.withUsername("aswin")
		.password("aswin@123")
		.roles("USER","ADMIN").build();
		
		UserDetails u3 = User.withUsername("gokul")
		.password("gokul@123")
		.roles("ADMIN").build();
		
		//in memory userdetails service
		return new InMemoryUserDetailsManager(u1, u2, u3);
	}
	
	@Bean
	public AuthenticationProvider authenticationProvider(UserDetailsService uds) {
		DaoAuthenticationProvider ap=new DaoAuthenticationProvider(uds);
		ap.setPasswordEncoder(passwordEncoder());
		return ap;
	}
}
