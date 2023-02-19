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
@Table(name = "Product2")
public class Cart {

    @Id
<<<<<<< HEAD
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long cartId;
    private int quantity;
=======
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long CartId;
    private int Quantity;
>>>>>>> 99b61156194d354eae9258aec26b5dd5e4e9e68e
    private long ProductId;
    private long customerId;
    private Date createdAt;




    private Date UpdatedAt;



    public void setQuantity(int quantity) {
        Quantity = quantity;
    }

    public void setProductId(long productId) {
        ProductId = productId;
    }

    public void setCustomerId(long customerId) {
        CustomerId = customerId;
    }

    public void setCreatedAt(Date createdAt) {
        CreatedAt = createdAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        UpdatedAt = updatedAt;
    }

    public void setCartId(long cartId) {
        CartId = cartId;
    }
}
