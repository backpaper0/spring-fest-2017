package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.core.Authentication;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableResourceServer
@RestController
public class ResourceApplication {

    public static void main(final String[] args) {
        SpringApplication.run(ResourceApplication.class, args);
    }

    @GetMapping("/hello")
    public String sayHello(final Authentication a) {
        return String.format("Hello, %s!!", a.getName());
    }
}