package com.example.customerbackend.service;

import com.example.customerbackend.model.entity.Orders;
import com.example.customerbackend.model.entity.Product;
import com.example.customerbackend.repository.OrdersRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Arrays;
import java.util.List;

import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class OrdoersServiceTest {

    @Mock
    private OrdersRepository ordersRepository;
    @InjectMocks
    private OrdersService ordersService;

    @Test
    void should_return_successs_when_call_crateOrders() {
        Orders orders = new Orders();
        Orders mockOrders = orders;
        when(ordersRepository.save(orders)).thenReturn(mockOrders);
        ordersService.createOrder(orders);
        Mockito.verify(ordersRepository, Mockito.times(1)).save(orders);
    }

//    @Test
//    void should_return_all_data_when_call_getOrderByCustomerId(){
//        Orders orders1 = new Orders();
//        Iterable<Orders> mockOrders = Arrays.asList(orders1);
//        when(ordersRepository.findAll()).thenReturn(mockOrders);
//        long customerId =
//        List<Product> actualOrders = ordersService.getOrderByCustomerId();
//        Mockito.verify(productRepository,Mockito.times(1)).findAll();
//        Assertions.assertFalse(actualProeuct.isEmpty());
//    }
}
