package com.ust.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import com.ust.demo.filter.JwtAuthenticationFilter;

@Configuration
@EnableMethodSecurity
public class MySecurityConfiguration {

	@Bean
	public PasswordEncoder passwordEncoder() {
		return NoOpPasswordEncoder.getInstance();
	}
	
	
	
	@Bean
	public AuthenticationProvider ap(UserDetailsService uds) {
		DaoAuthenticationProvider dap=new DaoAuthenticationProvider(uds);
		dap.setPasswordEncoder(passwordEncoder());
		return dap;
	}
	
	@Bean
	SecurityFilterChain securityFilterChain(HttpSecurity http, JwtAuthenticationFilter jwtFilter, AuthenticationProvider ap) throws Exception {
	    return http
	        .csrf(csrf -> csrf.disable())	        
	        .headers(headers -> headers.frameOptions(frame -> frame.disable()))
	        .authorizeHttpRequests(auth -> auth
	            .requestMatchers("/h2/**","/signup","/api/login").permitAll()
	            .anyRequest().authenticated()
	        )
//	        .formLogin(form -> form
//	                .permitAll()   // allow access to login page
//	            )
	        .sessionManagement(sess -> sess.sessionCreationPolicy(SessionCreationPolicy.STATELESS))
            .authenticationProvider(ap)
	        .addFilterBefore(jwtFilter, UsernamePasswordAuthenticationFilter.class)
	        .build();
	}

	
	@Bean
	public AuthenticationManager am(AuthenticationConfiguration config) {
		return config.getAuthenticationManager();
	}
	
}
