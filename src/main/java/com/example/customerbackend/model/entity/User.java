package com.example.customerbackend.model.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.UUID;

@Entity

@Table(name = "account")
@Data
public class User {
    @Id

    private String id;



    private String username;


    private String email;

    private String password;
}
