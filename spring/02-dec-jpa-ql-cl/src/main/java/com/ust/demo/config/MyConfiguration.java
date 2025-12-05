package com.ust.demo.config;

import java.util.List;
import java.util.Optional;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.ust.demo.model.Product;
import com.ust.demo.repository.ProductRepository;

@Configuration
public class MyConfiguration {

	
	
	
	@Bean
	public CommandLineRunner cr(ProductRepository pr) {
//		return new CommandLineRunner() {
//			
//			@Override
//			public void run(String... args) throws Exception {
//				// TODO Auto-generated method stub
//				
//			}
//		};
		return (args)->{
			System.out.println("Hi this is command line runner.....Thanks to Shri Sena...");
//			List<Product> products = pr.findAll();
//			System.out.println(products);
			Product product=new Product();
			product.setName("Logitech Mouse");
			product.setCategory("Electronics");
			product.setPrice(500.0);
			Product p = pr.save(product);
			System.out.println("Product is added...Id is "+p.getId());
			
			System.out.println(pr.findById(p.getId()).orElse(null));
			
		};
	}
}
