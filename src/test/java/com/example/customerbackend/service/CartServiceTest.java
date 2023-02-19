package com.example.customerbackend.service;


import com.example.customerbackend.model.entity.AddToCartRequest;
import com.example.customerbackend.model.entity.Cart;
import com.example.customerbackend.model.entity.DeleteItemInCartRequest;
import com.example.customerbackend.model.entity.Product;
import com.example.customerbackend.repository.CartRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class CartServiceTest {

    @Mock
    CartRepository cartRepository;

    @InjectMocks
    CartService cartService;

    @Test
    void getCarts_ShouldCallRepo1Time_And_hasData() {
        Cart cart = new Cart();
        List<Cart> mockProducts = Arrays.asList(cart);
        Long customerId = Long.valueOf(10);
        when(cartRepository.findByCustomerId(customerId)).thenReturn(mockProducts);

        List<Cart> actualCart = cartService.getCarts(customerId);
        Mockito.verify(cartRepository, Mockito.times(1)).findByCustomerId(customerId);
        Assertions.assertFalse(actualCart.isEmpty());
    }

    @Test
    void addToCart_ShouldGetCallRepository1time_And_sendData() {
        Cart cart = new Cart();
        AddToCartRequest addToCartRequest = new AddToCartRequest();
        Cart mockProducts = cart;
        when(cartRepository.save(cart)).thenReturn(mockProducts);
        cartService.addCart(addToCartRequest);
        Mockito.verify(cartRepository, Mockito.times(1)).save(cart);
    }

    @Test
    void removeItem_ShouldCallRepository1Time_And_sendData() {
        DeleteItemInCartRequest deleteItemInCartRequest1 = new DeleteItemInCartRequest();
        Cart cart = new Cart();

        cartService.removeItem(deleteItemInCartRequest1);

        verify(cartRepository).delete(cart);
    }
}
