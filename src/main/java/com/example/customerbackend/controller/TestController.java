package com.example.customerbackend.controller;

import com.example.customerbackend.model.entity.Product;
import com.example.customerbackend.model.entity.User;
import com.example.customerbackend.repository.ProductRepository;
import com.example.customerbackend.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @Autowired
    ProductRepository productRepository;

    @Autowired
    UserRepository userRepository;

    @GetMapping("/product/create")
    public ResponseEntity<String> createProeuct(){
        Product product = new Product();
        Product savedProduct = productRepository.save(product);
        return ResponseEntity.ok("new product id:"+savedProduct.getId());
    }

    @GetMapping("/user/test")
    public ResponseEntity<String> createUser(){
        User user = new User();
        user.setId("94d0e39b-ee48-4e67-9cc3-86072f2d15da");
        user.setUsername("User");
        user.setPassword("1234");
        User savedUser = userRepository.save(user);
        return ResponseEntity.ok("new user id:"+savedUser.getId()+" username: "+savedUser.getUsername()+" password: "+savedUser.getPassword());
    }


}
