package com.example.customerbackend.model.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name  = "product")
@Data
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
}
