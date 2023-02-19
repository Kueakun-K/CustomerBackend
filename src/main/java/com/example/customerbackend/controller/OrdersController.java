package com.example.customerbackend.controller;

import com.example.customerbackend.model.entity.Orders;
import com.example.customerbackend.repository.OrdersRepository;
import com.example.customerbackend.service.OrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class OrdersController {
    @Autowired
    OrdersRepository ordersRepository;
    OrdersService ordersService;

    @PostMapping(path = "/CreateOrders")
    public ResponseEntity<?> createOrder(@RequestBody Orders orders)
    {
        ordersService.createOrder(orders);

        return ResponseEntity.ok(orders);
    }

    @GetMapping(path = "/GetOrders/findByOrderId/{id}")
    public  ResponseEntity<?> getOrdersByOrdersId(@PathVariable("id") long orderId) {
        ordersService.getOrdersByOrdersId(orderId);
        return ResponseEntity.ok(orderId);
    }

}
