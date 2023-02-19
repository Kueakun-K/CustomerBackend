package com.example.customerbackend.model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.Date;

@Entity
public class Cart {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long CartId;
    private int Quantity;
    private long ProductId;
    private long CustomerId;
    private Date CreatedAt;



    private Date UpdatedAt;

    public  Cart (){

    }

    public Cart(long CartId, int Quantity,
                long ProductId, long CustomerId, Date CreatedAt, Date UpdatedAt) {

        this.CartId = CartId;
        this.Quantity = Quantity;
        this.ProductId = ProductId;
        this.CustomerId = CustomerId;
        this.CreatedAt = CreatedAt;
        this.UpdatedAt = UpdatedAt;
    }

    @Id
    public long getCartId() {
        return CartId;
    }
    public int getQuantity() {
        return Quantity;
    }

    public long getProductId() {
        return ProductId;
    }

    public long getCustomerId() {
        return CustomerId;
    }

    public Date getCreatedAt() {
        return CreatedAt;
    }

    public Date getUpdatedAt() {
        return UpdatedAt;
    }

}