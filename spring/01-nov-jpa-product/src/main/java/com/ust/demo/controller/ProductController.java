package com.ust.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ust.demo.entity.Product;
import com.ust.demo.service.ProductService;

@RestController
@RequestMapping("/product")
public class ProductController {
	@Autowired
	private ProductService ps;
	
	@PostMapping
	public Product addProduct(@RequestBody Product product) {
		return ps.create(product);
	}
	
	@GetMapping
	public List<Product> retrieveAllProducts() {
		return ps.read();
	}
	
	@GetMapping("/{id}")
	public Product findProductById(@PathVariable("id")Integer id) {
		Optional<Product> op = ps.read(id);
		if(op.isPresent()) {
			return op.get();
		}
		return null;
	}
	
	@PutMapping("/{id}")
	public Product updateProduct(@PathVariable Integer id,@RequestBody Product product) {
		return ps.update(product);
	}
	
	@DeleteMapping("/{id}")
	public String deleteProduct(@PathVariable Integer id) {
		ps.delete(id);
		return "Deleted";
	}
	
}
