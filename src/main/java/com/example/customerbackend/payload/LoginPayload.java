package com.example.customerbackend.payload;

import jakarta.persistence.Entity;
import lombok.Data;

@Data
public class LoginPayload {

    private String username;

    private String password;

}
