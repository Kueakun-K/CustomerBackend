package com.example.customerbackend.service;

import com.example.customerbackend.model.entity.User;
import com.example.customerbackend.repository.UserRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class AuthServiceTest {
    @Mock
    private UserRepository userRepository;

    @InjectMocks
    private AuthService authService;


    @Test
    void login_should_call_UserRepository_1Time(){
        String username = "User";
        String password = "1234";

        List<User> actualUser = authService.Login(username, password);

        Mockito.verify(userRepository,Mockito.times(1)).findByUsernameAndPassword(username, password);
    }
    @Test
    void should_return_false_when_call_login_with_username_and_password_correct(){
//        // Given
//        String username = "User";
//        String password = "1234";
//        // When
//        List<User> actualUser = authService.Login(username, password);
//        // Then
//        Assertions.assertFalse(actualUser.isEmpty());
    }
    @Test
    void should_return_empty_when_call_login_with_username_and_password_incorrect(){
        // Given
        String username = "User";
        String password = "4321";
        // When
        List<User> actualUser = authService.Login(username, password);
        // Then
        Assertions.assertTrue(actualUser.isEmpty());
    }

    @Test
    void should_cannot_login_when_call_login_with_username_or_password_is_null(){
        // Given
        String username = "";
        String password = "";
        // When
        List<User> actualUser = authService.Login(username, password);
        // Then
        Assertions.assertNull(actualUser);
    }

}
