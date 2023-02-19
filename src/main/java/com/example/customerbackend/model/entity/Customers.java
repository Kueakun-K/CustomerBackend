package com.example.customerbackend.model.entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "customers")
public class Customers {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long CustomerID;
    private String name;
    private String Email;
    private String Password;
    private Date createdAt;
    private Date UpdatedAt;

}
