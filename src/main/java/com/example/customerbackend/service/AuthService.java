package com.example.customerbackend.service;

import com.example.customerbackend.model.entity.Product;
import com.example.customerbackend.model.entity.User;
import com.example.customerbackend.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthService {

    @Autowired
    UserRepository userRepository;

    public List<User> Login(String username, String password) {
        List<User> user = userRepository.findByUsernameAndPassword(username, password);
        return user;
    }



}
