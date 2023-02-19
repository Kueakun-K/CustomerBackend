package com.example.customerbackend.controller;

import com.example.customerbackend.model.entity.User;
import com.example.customerbackend.payload.LoginPayload;
import com.example.customerbackend.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AuthController {

    private final AuthService authService;

    @Autowired
    public AuthController(AuthService authService) {
        this.authService = authService;
    }

    @PostMapping("/auth/login")
    public ResponseEntity<?> login(@RequestBody LoginPayload loginPayload) {
        List<User> user = authService.Login(loginPayload.getUsername(), loginPayload.getPassword());
        if(user.isEmpty()) {
            return ResponseEntity.badRequest().body("Username or Password incorrect");
        }
        else{
            return ResponseEntity.ok(user);
        }
    }


}
