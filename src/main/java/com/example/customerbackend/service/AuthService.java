package com.example.customerbackend.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class AuthService {



//    public String VerifyPassword( String password, String confirm_password){
//
//    }
    public String Login(String username, String password) {
        if(username.equals("User")  && password.equals("1234")){
            return "login successful";
        }
        else {
            return "cannot login";
        }
    }

}
