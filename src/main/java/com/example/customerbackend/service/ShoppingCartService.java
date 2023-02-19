package com.example.customerbackend.service;

import com.example.customerbackend.exception.NotEnoughProductsInStockException;
import com.example.customerbackend.model.entity.Product;

import java.math.BigDecimal;
import java.util.Map;

public interface ShoppingCartService {
    void addProduct(Product product);

    void removeProduct(Product product);

    Map<Long, Product> getProductsInCart();

    void checkout() throws NotEnoughProductsInStockException;

    BigDecimal getTotal();
}
