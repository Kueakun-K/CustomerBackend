package com.example.customerbackend.service.Impl;

import com.example.customerbackend.model.entity.Product;
import com.example.customerbackend.repository.ProductRepository;
import com.example.customerbackend.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
public class ProductServiceImpl implements ProductService {
    private ProductRepository productRepository;

    @Autowired
    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }



    public List<Product> getProducts() {
        Iterable<Product> products = productRepository.findAll();
        List<Product> productList = StreamSupport
                .stream(products.spliterator(), false)
                .collect(Collectors.toList());
        return productList;
    }

    @Override
    public Optional<Product> findById(Long id) {
        return productRepository.findById(id);
    }
}
