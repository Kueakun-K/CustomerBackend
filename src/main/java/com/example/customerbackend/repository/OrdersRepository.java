package com.example.customerbackend.repository;

import com.example.customerbackend.model.entity.Cart;
import com.example.customerbackend.model.entity.Orders;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrdersRepository extends CrudRepository<Orders,Long> {
    List<Orders> findByOrdersId(long id);
    List<Orders> findByCustomerId(long id);
    List<Orders> findByProductsId(long id);
}
