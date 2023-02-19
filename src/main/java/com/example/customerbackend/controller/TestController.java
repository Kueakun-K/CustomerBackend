package com.example.customerbackend.controller;

import com.example.customerbackend.model.entity.Product;
import com.example.customerbackend.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @Autowired
    ProductRepository productRepository;

    @GetMapping("/product/create")
    public ResponseEntity<String> createProeuct(){
        Product product = new Product();
        Product savedProduct = productRepository.save(product);
        return ResponseEntity.ok("new product id:"+savedProduct.getId());
    }
}
