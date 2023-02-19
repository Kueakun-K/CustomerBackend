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
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class AuthServiceTest {
    @Mock
    private UserRepository userRepository;

    @InjectMocks
    private AuthService authService;

    @Test
    void testUserNameNullShouldThrowException(){
        assertThrows(RuntimeException.class, () -> {
            authService.Login(null   , null);
        });
    }

    @Test
    void testUserNameOrPasswordEmptyShouldThrowException(){
        assertThrows(RuntimeException.class, () -> {
            authService.Login(""   , "");
        });
    }
    @Test
    void should_return_user_when_call_login_with_username_and_password(){
        String username = "Test";
        String password = "1234";
        User user1 = new User();

        when(userRepository.findByUsernameAndPassword(username, password)).thenReturn(List.of(user1));
        User actualUser = authService.Login(username, password);

        assertEquals(user1.getUsername(), actualUser.getUsername());
    }


    @Test
    void testUserNameNotNullShouldButIncorrectUsernameAndPasswordThrowException(){
        String username = "wed";
        String password = "dwdwe";

        assertThrows(RuntimeException.class, () -> {
            authService.Login(  username , password);
        });
    }
}
