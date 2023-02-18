package com.example.customerbackend.controller;

import com.example.customerbackend.payload.LoginPayload;
import com.example.customerbackend.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
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
        return ResponseEntity.ok(loginPayload.getUsername() + loginPayload.getPassword());
    }

}
