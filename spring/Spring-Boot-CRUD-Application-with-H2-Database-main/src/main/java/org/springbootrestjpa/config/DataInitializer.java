package org.springbootrestjpa.config;

import org.springbootrestjpa.model.Product;
import org.springbootrestjpa.repository.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataInitializer implements CommandLineRunner {

    private final ProductRepository productRepository;

    public DataInitializer(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        productRepository.save(new Product("Product 1", "Description 1", 100.0));
        productRepository.save(new Product("Product 2", "Description 2", 200.0));
    }
}
