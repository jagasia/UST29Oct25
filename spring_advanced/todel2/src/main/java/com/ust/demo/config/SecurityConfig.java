package com.ust.demo.config;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

  @Bean
  SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
    http
      .authorizeHttpRequests(auth -> auth
        .requestMatchers("/", "/login", "/error").permitAll()
        .anyRequest().authenticated()
      )
      .oauth2Login(oauth -> { })   // enables OAuth2 Login
      .logout(logout -> logout.logoutSuccessUrl("/"));

    return http.build();
  }
}
