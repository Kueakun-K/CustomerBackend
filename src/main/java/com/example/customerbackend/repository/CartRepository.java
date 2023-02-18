package com.example.customerbackend.repository;


import com.example.customerbackend.model.entity.Cart;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;




@Repository
public interface CartRepository extends JpaRepository<Cart, Long> {}