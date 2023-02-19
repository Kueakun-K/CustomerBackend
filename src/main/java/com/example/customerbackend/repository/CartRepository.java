package com.example.customerbackend.repository;


import com.example.customerbackend.model.entity.Cart;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface CartRepository extends CrudRepository<Cart, Long> {
    List<Cart> findByCustomerId(long customerId);
}