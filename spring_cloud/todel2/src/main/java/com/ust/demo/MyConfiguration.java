package com.ust.demo;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class MyConfiguration {

	@Bean
	@LoadBalanced
	public RestTemplate rt()
	{
		return new RestTemplate();
	}
}