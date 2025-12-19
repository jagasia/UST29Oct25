package com.ust.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class MyApiGatewayApplication {
	
	@Bean
	public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
		return builder.routes()
		.route("product",r->r.path("/product/**").uri("http://localhost:8081"))
		.route("customer",r->r.path("/customer/**").uri("http://localhost:8082"))
		.route("sales",r->r.path("/sales/**").uri("http://localhost:8083"))
		.build();
	}

	public static void main(String[] args) {
		SpringApplication.run(MyApiGatewayApplication.class, args);
	}

}
