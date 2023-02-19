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
        // Case1
        // When

        assertThrows(RuntimeException.class, () -> {
            authService.Login(null   , null);
        });
    }

    @Test
    void testUserNameEmptyShouldThrowException(){
        // Case1
        // When

        assertThrows(RuntimeException.class, () -> {
            authService.Login(""   , "");
        });
    }
    @Test
    void should_return_user_when_call_login_with_username_and_password(){
        // Given
        String username = "Test";
        String password = "1234";
        User user1 = new User();


        // Case1
        // When
        when(userRepository.findByUsernameAndPassword(username, password)).thenReturn(List.of(user1));
        User actualUser = authService.Login(username, password);
        // Then
        assertEquals(user1.getUsername(), actualUser.getUsername());
        //assertEquals(user1.getPassword(),actualUser.getPassword());

        // Case2
//        when(userRepository.findByUsernameAndPassword(username, password)).thenReturn(List.of());
//        assertEquals(List.of(), actualUser);

    }


    @Test
    void testUserNameNotNullShouldButIncorrectUsernameAndPasswordThrowException(){

        //given
        String username = "wed";
        String password = "dwdwe";

        // When

        assertThrows(RuntimeException.class, () -> {
            authService.Login(  username , password);
        });
    }





}
