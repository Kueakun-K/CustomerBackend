package com.example.customerbackend.controller;

import com.example.customerbackend.payload.LoginPayload;
import com.example.customerbackend.service.AuthService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;


@ExtendWith(MockitoExtension.class)
public class AuthControllerTest {
    @Mock
    private AuthService authService;

    @InjectMocks
    private AuthController authController;

    @Test
    void should_return_status_ok_when_call_login_with_username_and_password() {
        when(authService.Login("User","1234")).thenReturn("login successful");

        LoginPayload user = new LoginPayload();
        user.setUsername("User");
        user.setPassword("1234");
        ResponseEntity<?> response = authController.login(user);

        assertEquals(HttpStatus.OK, response.getStatusCode());
        assertEquals("login successful", response.getBody());
    }
}
