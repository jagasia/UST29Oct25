package com.ust.demo.controller;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.ust.demo.model.Product;
import com.ust.demo.service.ProductService;

@RestController
@RequestMapping("/product")
public class ProductController {
	@Autowired
	private ProductService ps;
	
//	@PostMapping
//	public Product create(@RequestBody Product product) {
//		return ps.create(product);
//	}
	
//	@PostMapping(consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
//	public Product create(@RequestPart Product product,@RequestPart MultipartFile file) throws IOException {
//		byte[] photo = file.getBytes();
//		product.setPhoto(photo);
//		return ps.create(product);
//	}
	

	@PostMapping(path = "/product", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
	public Product create(@RequestPart("product") String productJson,
	                      @RequestPart("file") MultipartFile file) throws Exception {

	    ObjectMapper mapper = new ObjectMapper();
	    Product product = mapper.readValue(productJson, Product.class);

	    product.setPhoto(file.getBytes());
	    return ps.create(product);
	}

	
	@GetMapping
	public List<Product> read() {
		return ps.read();
	}
	
	@GetMapping("/{id}")
	public Optional<Product> read(@PathVariable Integer id) {
		return ps.read(id);
	}
	
	@PutMapping("/{id}")
	public Product update(@PathVariable Integer id, @RequestBody Product product) {
		return ps.update(product);
	}
	
	@DeleteMapping("/{id}")
	public String delete(@PathVariable Integer id) {
		ps.delete(id);
		return "delete'd";
	}
	
	@GetMapping("/category/{category}")
	public List<Product> findProductsByCategory(@PathVariable String category) {
		return ps.findByCategory(category);
	}
	
	@GetMapping("/price/{min}/{max}")
	public List<Product> findProductsByPriceRange(@PathVariable("min") Double from,@PathVariable("max") Double to) {
		return ps.findByPriceRange(from, to);
	}
	
}
