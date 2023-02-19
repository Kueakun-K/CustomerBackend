package com.example.customerbackend.model.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table( name = "orders")
public class Orders {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY )
    private long ID;
    private Double Price;

    private int Quantity;
    private long productId ;
    private long Customers;
    private Date createdAt;
    private Date UpdatedAt;
}
