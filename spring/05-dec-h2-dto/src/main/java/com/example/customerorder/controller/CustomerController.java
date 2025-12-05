package com.example.customerorder.controller;

import java.net.URI;
import java.nio.channels.NonReadableChannelException;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.customerorder.dto.CustomerRequest;
import com.example.customerorder.dto.OrderRequest;
import com.example.customerorder.model.Customer;
import com.example.customerorder.model.Order;
import com.example.customerorder.repository.CustomerRepository;
import com.example.customerorder.repository.OrderRepository;

@RestController
@RequestMapping("/customers")
public class CustomerController {

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private OrderRepository orderRepository;

    // TODO: Implement a REST endpoint for creating customers
    // HTTP Method: POST
    // Endpoint: /customers
    // Request Body: CustomerRequest DTO
    // Return: ResponseEntity with the created Customer and HTTP Status 201 (Created)

    @PostMapping("/customers")
    public ResponseEntity<Customer> create(@RequestBody CustomerRequest customerRequest) {
    	Customer customer=new Customer(customerRequest.getName(), customerRequest.getEmail());
    	Customer c = customerRepository.save(customer);
    	return new ResponseEntity<>(c, HttpStatus.CREATED);
    }

    // TODO: Implement a REST endpoint for creating orders for a specific customer
    // HTTP Method: POST
    // Endpoint: /customers/{customerId}/orders
    // Path Variable: customerId
    // Request Body: OrderRequest DTO
    // Return: ResponseEntity with the created Order and HTTP Status 201 (Created), or 404 (Not Found) if customer doesn't exist

    @PostMapping("/customers/{customerId}/orders")
    public ResponseEntity<Order> createOrder(@PathVariable("customerId") Long customerId, @RequestBody OrderRequest or) {
    	Order order=new Order(or.getTotalAmount());
    	Optional<Customer> op = customerRepository.findById(customerId);
    	if(op.isPresent()) {
    		//customer found
    		order.setCustomer(op.get());
    		Order o = orderRepository.save(order);
        	return new ResponseEntity<>(o,HttpStatus.CREATED);	
    	}else {
    		//customer not found
    		return ResponseEntity.notFound().build();
    	}
    }

    // TODO: Implement a REST endpoint for getting all orders for a specific customer
    // HTTP Method: GET
    // Endpoint: /customers/{customerId}/orders
    // Path Variable: customerId
    // Return: ResponseEntity with a List of Orders and HTTP Status 200 (OK), or 404 (Not Found) if customer doesn't exist

    @RequestMapping(value = "/customers/{customerId}/orders", method = RequestMethod.GET)
    public ResponseEntity<List<Order>> getOrdersByCustomer(@PathVariable Long customerId) {
    	Optional<Customer> op = customerRepository.findById(customerId);
    	if(op.isEmpty()) {
    		return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    	}
    	List<Order> result = orderRepository.findByCustomerId(customerId);
    	return new ResponseEntity<>(result, HttpStatus.OK);
    }

    // TODO: Implement a REST endpoint that uses the JPQL query from OrderRepository
    // to find orders with a totalAmount greater than a specified minimum amount.
    // HTTP Method: GET
    // Endpoint: /orders/totalAmountGreaterThan
    // Request Parameter: minAmount (e.g., /orders/totalAmountGreaterThan?minAmount=100.0)
    // Return: ResponseEntity with a List of Orders and HTTP Status 200 (OK)
    @GetMapping("/orders/totalAmountGreaterThan")
    public ResponseEntity<List<Order>> getOrdersGreaterThanTotalAmount(@RequestParam double minAmount) {
        // You will need to call the JPQL method from orderRepository here
    	List<Order> res = orderRepository.findOrdersByTotalAmountGreaterThan(minAmount);
//        return ResponseEntity.ok(null);
    	return new ResponseEntity<>(res,HttpStatus.OK);
    }
}
