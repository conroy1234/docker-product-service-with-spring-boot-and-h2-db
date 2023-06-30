package com.product.service;

import com.product.dto.Product;
import com.product.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProductService {
    @Autowired
    ProductRepository productRepository;

    public Iterable<Product> findAll(){
        return productRepository.findAll();
    }

    public Optional<Product> findById(String productId){
        return productRepository.findById(productId);
    }

    public Product save(Product product){
        return productRepository.save(product);
    }

}