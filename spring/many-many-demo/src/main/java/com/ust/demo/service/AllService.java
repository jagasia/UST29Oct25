package com.ust.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ust.demo.exception.CustomerAlreadyExistsException;
import com.ust.demo.exception.CustomerNotFoundException;
import com.ust.demo.exception.ProductAlreadyExistsException;
import com.ust.demo.exception.ProductNotFoundException;
import com.ust.demo.model.Customer;
import com.ust.demo.model.CustomerRepository;
import com.ust.demo.model.Product;
import com.ust.demo.model.ProductRepository;

@Service
public class AllService {
	@Autowired
	private CustomerRepository cr;
	@Autowired
	private ProductRepository pr;

	public Product createProduct(Product product) throws ProductAlreadyExistsException {
		//check if product has id. If yes, raise exception
		if(product.getId()!=null) {
			throw new ProductAlreadyExistsException("There is already a product with id: "+product.getId());
		}
		return pr.save(product);
	}

	public Customer createCustomer(Customer customer) throws CustomerAlreadyExistsException {
		//check if product has id. If yes, raise exception
		if(customer.getId()!=null) {
			throw new CustomerAlreadyExistsException("There is already a customer with id: "+customer.getId());
		}
		return cr.save(customer);
	}

	public List<Product> retrieveAllProducts() {
		return pr.findAll();
	}

	public List<Customer> retrieveAllCustomers() {
		return cr.findAll();
	}
	
	public Optional<Product> findProductById(Long id) {
		return pr.findById(id);
	}
	
	public Optional<Customer> findCustomerById(Long id) {
		return cr.findById(id);
	}

	public Product updateProduct(Product product) throws ProductNotFoundException {
		 Optional<Product> op = findProductById(product.getId());
		if(op.isEmpty()) {
			throw new ProductNotFoundException("No product found for id: "+product.getId());
		}
		return pr.save(op.get());
	}

	public Customer updateCustomer(Customer customer) throws CustomerNotFoundException {
		 Optional<Customer> op = findCustomerById(customer.getId());
		if(op.isEmpty()) {
			throw new CustomerNotFoundException("No customer found for id: "+customer.getId());
		}
		return cr.save(op.get());
	}

	public Product deleteProduct(Long id) throws ProductNotFoundException {
		Optional<Product> op=findProductById(id);
		if(op.isEmpty()) {
			String str=String.format("No product found with id %d to delete",id);
			throw new ProductNotFoundException(str);
		}
		Product product=op.get();
		pr.delete(product);
		return product;
	}

	public Customer deleteCustomer(Long id) throws CustomerNotFoundException {
		Optional<Customer> op=findCustomerById(id);
		if(op.isEmpty()) {
			String str=String.format("No customer found with id %d to delete",id);
			throw new CustomerNotFoundException(str);
		}
		Customer product=op.get();
		cr.delete(product);
		return product;
	}

}
