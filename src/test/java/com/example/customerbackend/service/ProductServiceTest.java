package com.example.customerbackend.service;

import com.example.customerbackend.model.entity.Product;
import com.example.customerbackend.repository.ProductRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class ProductServiceTest {

    @Mock
    ProductRepository productRepository;

    @InjectMocks
    ProductService  productService;
    @Test
    void getProducts_ShouldCallRepository1Time_AndHasData() {
        Product product1 = new Product();
        Iterable<Product> mockProducts = Arrays.asList(product1);
        when(productRepository.findAll()).thenReturn(mockProducts);

        List<Product> actualProeuct = productService.getProducts();
        Mockito.verify(productRepository,Mockito.times(1)).findAll();
        Assertions.assertFalse(actualProeuct.isEmpty());

    }

}