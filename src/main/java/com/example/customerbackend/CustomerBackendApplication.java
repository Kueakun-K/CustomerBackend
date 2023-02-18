package com.example.customerbackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class CustomerBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(CustomerBackendApplication.class, args);
    }

}
