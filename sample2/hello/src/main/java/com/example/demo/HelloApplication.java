package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableOAuth2Sso
@RestController
public class HelloApplication {

    public static void main(final String[] args) {
        SpringApplication.run(HelloApplication.class, args);
    }

    @GetMapping
    public String sayHello(final Authentication a) {
        return String.format("Hello, %s!", a.getName());
    }
}