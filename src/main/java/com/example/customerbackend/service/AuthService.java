package com.example.customerbackend.service;

import com.example.customerbackend.model.entity.User;
import com.example.customerbackend.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.List;

@Service
public class AuthService {

    @Autowired
    UserRepository userRepository;

    public User Login(String username, String password) {
        if(!StringUtils.hasText(username) || !StringUtils.hasText(password)){
            throw new RuntimeException();
        }
        List<User> user = userRepository.findByUsernameAndPassword(username, password);
        if (user.isEmpty()) {
            throw new RuntimeException();
        }
        return user.get(0);
    }
}
