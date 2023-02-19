package com.example.customerbackend.service;

import com.example.customerbackend.model.entity.Product;

import java.util.Optional;

public interface ProductService {
    Optional<Product> findById(Long id);
}
