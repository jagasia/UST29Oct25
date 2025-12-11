package org.springbootrestjpa.service;

import org.springbootrestjpa.model.Product;
import org.springbootrestjpa.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    private final ProductRepository productRepository;
    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }
    public Optional<Product> getProductById(Long id) {
        return productRepository.findById(id);
    }
    public Product saveProduct(Product product) {
        return productRepository.save(product);
    }
    public Product updateProduct(Long Id,Product product) {
        product.setId(Id);
        return productRepository.save(product);
    }
    public void deleteProduct(Long id) {
        productRepository.deleteById(id);

    }
}
