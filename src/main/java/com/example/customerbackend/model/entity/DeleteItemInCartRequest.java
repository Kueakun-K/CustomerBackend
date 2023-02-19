package com.example.customerbackend.model.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class DeleteItemInCartRequest

{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long cartId;

}
