package com.example.customerbackend.service;

import com.example.customerbackend.model.entity.Cart;
import com.example.customerbackend.model.entity.Orders;
import com.example.customerbackend.repository.OrdersRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class OrdersService {

    @Autowired
    OrdersRepository ordersRepository;

    public String createOrder(Orders orders) {
        ordersRepository.save(orders);
        return "success";
    }

    public List<Orders> getOrdersByOrdersId(long orderId) {
        return ordersRepository.findByOrdersId(orderId);
    }

    public List<Orders> getOrderByCustomerId(long customerId) {
        return  ordersRepository.findByCustomerId(customerId);
    }
}
