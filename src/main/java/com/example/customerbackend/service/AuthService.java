package com.example.customerbackend.service;

import org.springframework.stereotype.Service;

@Service
public class AuthService {
    public boolean Login(String username, String password) {
        if(username.equals("User")  && password.equals("1234")){
            return true;
        }
        else {
            return false;
        }
    }
}
