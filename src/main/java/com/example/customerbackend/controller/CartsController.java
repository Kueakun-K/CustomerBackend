package com.example.customerbackend.controller;

import com.example.customerbackend.model.entity.AddToCartRequest;
import com.example.customerbackend.model.entity.Cart;
import com.example.customerbackend.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import com.example.customerbackend.repository.CartRepository;

import java.util.List;

@RestController
public class CartsController {


    @Autowired
    private CartService cartService;

    @Autowired
    CartRepository cartRepository;

//    @Autowired
//    public CartsController(CartRepository cartRepository){
//    this.cartRepository = cartRepository;
//    }

    @GetMapping("/carts/{id}")
    public ResponseEntity<List<Cart>> findAllCartInCustomerId(@PathVariable("id") long customerId) {
        List<Cart>  carts = cartService.getCarts(customerId);
        return ResponseEntity.ok(carts);
    }

    @PostMapping("/cart/addtocart")
    public ResponseEntity<String> AddItem(@Validated @RequestBody AddToCartRequest addToCartRequest) {

        try {
            Cart savedCart = cartService.addCart(addToCartRequest);
                return ResponseEntity.ok("new cart id:" + savedCart.getCartId() + savedCart.getCustomerId());

        }catch (Exception e) {
            System.out.println(e);
            return ResponseEntity.status(500).body("server error");
        }
    }


	
}

