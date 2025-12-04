package com.ust.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ust.demo.exception.ProductAlreadyExistsException;
import com.ust.demo.exception.ProductNotFoundException;
import com.ust.demo.model.Product;
import com.ust.demo.service.AllService;

@RestController
@RequestMapping("/product")
public class ProductController {
	private AllService ar;
	
	public ProductController(AllService ar) {
		this.ar=ar;
	}
	
	@PostMapping
	public Product create(@RequestBody Product product) throws ProductAlreadyExistsException {
		return ar.createProduct(product);
	}
	
	@GetMapping
	public List<Product> read() {
		return ar.retrieveAllProducts();
	}
	
	@GetMapping("/{id}")
	public Optional<Product> read(@PathVariable Long id) {
		return ar.findProductById(id);
	}
	
	@PutMapping("/{id}")
	public Product update(@PathVariable Long id, @RequestBody Product product) throws ProductNotFoundException {
		product.setId(id);
		return ar.updateProduct(product);
	}
	
	@DeleteMapping("/{id}")
	public Product delete(@PathVariable Long id) throws ProductNotFoundException {
		return ar.deleteProduct(id);
	}
	
}

