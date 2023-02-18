package com.example.customerbackend.service;

import com.example.customerbackend.exception.NotEnoughProductsInStockException;
import com.example.customerbackend.model.Product;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.Map;

public interface ShoppingCartService {

    void addProduct(Product product);

    void removeProduct(Product product);

    Map<Product, Integer> getProductsInCart();

    void checkout() throws NotEnoughProductsInStockException;

    BigDecimal getTotal();
}
