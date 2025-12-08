package com.ust.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ust.demo.model.Product;
import com.ust.demo.service.ProductService;

@SpringBootApplication
public class Application implements CommandLineRunner {
	
	private ProductService ps;
	
	public Application(ProductService ps) {
		this.ps=ps;
	}

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String ...args) {
		Product product=new Product();
		product.setName("Water bottle");
		product.setCategory("Fancy");
		product.setPrice(100.0);
		
		Product res = ps.create(product);
		if(res.getId()!=null) {
			//success
			System.out.println("Success");
		}else {
			System.out.println("Failure");
		}
		
	}
}
