package com.ust.demo.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product")
public class ProductController {
	
	@PostMapping
	public String create() {
		return "Added a new product";
	}
	
	@GetMapping
	public String read() {
		return "Listing all the products";
	}
	
	@GetMapping("/{id}")			//PathVariable
	public String read(@PathVariable("id") Integer id) {
		return "Found a product with id:"+id;
	}
	
	@PutMapping("/{id}")
	public String update(@PathVariable Integer id) {
		return "Updated product with id:"+id;
	}
	
	@DeleteMapping("/{id}")
	public String delete(@PathVariable Integer id) {
		return "Deleted product with id:"+id;
	}
	
}
