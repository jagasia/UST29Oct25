package com.ust.demo.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.ust.demo.model.Product;
import com.ust.demo.repository.ProductRepository;

@Service
public class ProductService {
	
    private final ProductRepository pr;
	
    public ProductService(ProductRepository pr) {
        this.pr = pr;
    }

    // Paging + sorting method
    public Page<Product> getProducts(int page, int size, String sortBy, String sortDir) {

        Sort sort = sortDir.equalsIgnoreCase("desc")
                ? Sort.by(sortBy).descending()
                : Sort.by(sortBy).ascending();

        Pageable pageable = PageRequest.of(page, size, sort);

        return pr.findAll(pageable);
    }

    // (Optional: other CRUD methods you may add later)
}
