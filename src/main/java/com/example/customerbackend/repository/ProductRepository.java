package com.example.customerbackend.repository;

import com.example.customerbackend.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;


public interface ProductRepository extends JpaRepository<Product, Long> {
    Optional<Product> findById(Long id);
}
