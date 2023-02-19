package com.example.customerbackend.service;

import com.example.customerbackend.model.entity.AddToCartRequest;
import com.example.customerbackend.model.entity.Cart;
import com.example.customerbackend.model.entity.DeleteItemInCartRequest;
import com.example.customerbackend.repository.CartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CartService {


    @Autowired
    CartRepository cartRepository;

    public List<Cart> getCarts(long customerId){
        Iterable<Cart> carts = cartRepository.findByCustomerId(customerId);
        List<Cart> result = new ArrayList<>();
        carts.forEach(result::add);
        return result;
    }

    public Cart addCart(AddToCartRequest addToCart){
        Cart cart = new Cart();
        System.out.println(addToCart);
        cart.setProductId(addToCart.getCustomerId());
        cart.setQuantity(addToCart.getQuantity());
        cart.setCustomerId(addToCart.getCustomerId());
        cartRepository.save(cart);
        return cart;
    }

    public void removeItem(DeleteItemInCartRequest removeItem)
    {
        Cart cart = new Cart();
        System.out.println(removeItem);
        cart.setCartId(removeItem.getCartId());


        cartRepository.delete(cart);
    }
}
