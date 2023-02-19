package com.example.customerbackend.service;

import com.example.customerbackend.model.entity.Product;
import com.example.customerbackend.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {

    @Autowired
    ProductRepository productRepository;
    public List<Product> getProducts(){
        Iterable<Product> products = productRepository.findAll();
        List<Product> result = new ArrayList<>();
        products.forEach(result::add);
        return result;
    }

}
