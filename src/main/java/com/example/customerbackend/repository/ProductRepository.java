package com.example.customerbackend.repository;

import com.example.customerbackend.model.entity.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product,Long> {
}
