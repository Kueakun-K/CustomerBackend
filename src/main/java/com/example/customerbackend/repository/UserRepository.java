package com.example.customerbackend.repository;

import com.example.customerbackend.model.entity.User;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UserRepository extends CrudRepository<User,Long> {
    List<User> findByUsernameAndPassword(String username, String password);
}
