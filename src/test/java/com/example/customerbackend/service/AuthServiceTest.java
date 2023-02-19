package com.example.customerbackend.service;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class AuthServiceTest {

    @InjectMocks
    private AuthService authService;

    @Test
    void should_return_true_when_call_login_with_username_and_password_correct(){
        // Given
        String username = "User";
        String password = "1234";
        // When
        boolean actual = authService.Login(username,password);
        // Then
        assertEquals(true, actual);
    }

    @Test
    void should_return_false_when_call_login_with_username_and_password_incorrect(){
        // Given
        String username = "Test";
        String password = "4321";
        // When
        boolean actual = authService.Login(username,password);
        // Then
        assertEquals(false, actual);
    }

}
