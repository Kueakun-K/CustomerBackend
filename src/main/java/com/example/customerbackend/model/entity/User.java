package com.example.customerbackend.model.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.UUID;

@Entity
@Table(name = "account")
@Data
public class User {
    @Id
    //@Column(name = "id")
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    //@Column(name = "username")
    private String username;

    //@Column(name = "password")
    private String password;
}
