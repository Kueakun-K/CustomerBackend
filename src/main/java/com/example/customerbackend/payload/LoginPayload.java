package com.example.customerbackend.payload;

import jakarta.persistence.Entity;
import lombok.Data;

@Data
public class LoginPayload {

    private String username;


    private String password;

//    public String getUsername() {
//        return username;
//    }
//
//    public void setUsername(String username) {
//        this.username = username;
//    }
//
//    public String getPassword() {
//        return password;
//    }
//
//    public void setPassword(String password) {
//        this.password = password;
//    }
}
