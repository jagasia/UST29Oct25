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

import com.ust.demo.exception.CustomerAlreadyExistsException;
import com.ust.demo.exception.CustomerNotFoundException;
import com.ust.demo.model.Customer;
import com.ust.demo.service.AllService;

@RestController
@RequestMapping("/customer")
public class CustomerController {
	private AllService ar;
	
	public CustomerController(AllService ar) {
		this.ar=ar;
	}
	
	@PostMapping
	public Customer create(@RequestBody Customer customer) throws CustomerAlreadyExistsException {
		return ar.createCustomer(customer);
	}
	
	@GetMapping
	public List<Customer> read() {
		return ar.retrieveAllCustomers();
	}
	
	@GetMapping("/{id}")
	public Optional<Customer> read(@PathVariable Long id) {
		return ar.findCustomerById(id);
	}
	
	@PutMapping("/{id}")
	public Customer update(@PathVariable Long id, @RequestBody Customer customer) throws CustomerNotFoundException {
		customer.setId(id);
		return ar.updateCustomer(customer);
	}
	
	@DeleteMapping("/{id}")
	public Customer delete(@PathVariable Long id) throws CustomerNotFoundException {
		return ar.deleteCustomer(id);
	}
	
}

