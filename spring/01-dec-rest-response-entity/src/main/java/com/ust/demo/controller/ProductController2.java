package com.ust.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.ResponseEntity.BodyBuilder;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product2")
public class ProductController2 {
	
	@PostMapping
	public ResponseEntity<String> create() {
		int i=2;
		if(i==1) {
//			throw new ArithmeticException("Arithmetic exception occurred");
			return new ResponseEntity<String>("Not found",HttpStatus.NOT_FOUND);					
		}
		ResponseEntity<String> re=new ResponseEntity<>("Added new Product", HttpStatus.CREATED);
		return re;
//		return "Added a new product";
	}
	
	@GetMapping
	public ResponseEntity<String> read() {
//		return "Listing all the products";
		return ResponseEntity.ok("Listing all");
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
