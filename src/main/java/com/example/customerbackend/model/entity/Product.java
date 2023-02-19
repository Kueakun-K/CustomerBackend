package com.example.customerbackend.model.entity;


import jakarta.persistence.*;
import jdk.jfr.Category;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name  = "product")
@Data

public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String Name;
    private String Detail;
    private Double Price;
    private int Quantity;
    private  boolean IsActive;
    private Date createdAt;
    private Date UpdatedAt;
    private long Category;
    private String Picture;

}
