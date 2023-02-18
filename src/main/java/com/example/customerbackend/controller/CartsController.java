package com.example.customerbackend.controller;

import com.example.customerbackend.model.entity.Cart;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import com.example.customerbackend.repository.CartRepository;

import java.util.List;

@RestController
public class CartsController {
    @Autowired
    private CartRepository CartRepository;

    @GetMapping("/{CustomerId}")
    public List<Cart> findAllUsers() {
        return CartRepository.findAll();
    }

    @PostMapping("/addtocart")
    public ResponseEntity<String> AddItem(@Validated @RequestBody Cart cart) {
        // Implement
        return ResponseEntity.status(200).body("add to cart success");
    }
	
}

