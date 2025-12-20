package com.ust.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class MyConfiguration {

	@Bean
	public SecurityFilterChain securityFilterChain(HttpSecurity http) {
		return 
				http
				.csrf((c)->c.disable())
				.headers((h)->h.frameOptions((f)->f.disable()))
				 .authorizeHttpRequests(auth -> auth
				            .requestMatchers("/").permitAll()
				            .anyRequest().authenticated()
				        )
				 .oauth2Login((o)->{})
				 .formLogin((f)->{})
				.build();			
	}
}
