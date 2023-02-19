package com.example.customerbackend.controller;

import com.example.customerbackend.payload.LoginPayload;
import com.example.customerbackend.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class AuthController {

    private final AuthService authService;

    @Autowired
    public AuthController(AuthService authService) {
        this.authService = authService;
    }

    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody LoginPayload loginPayload) {
        if(authService.Login(loginPayload.getUsername(), loginPayload.getPassword())) {
            return ResponseEntity.ok("Login successful");
        }
        else{
            return ResponseEntity.badRequest().body("Username or Password incorrect");
        }
    }


}
