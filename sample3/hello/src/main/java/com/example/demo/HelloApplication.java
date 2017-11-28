package com.example.demo;

import java.util.Objects;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.context.annotation.Bean;
import org.springframework.security.core.Authentication;
import org.springframework.security.oauth2.client.OAuth2ClientContext;
import org.springframework.security.oauth2.client.OAuth2RestTemplate;
import org.springframework.security.oauth2.client.resource.OAuth2ProtectedResourceDetails;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableOAuth2Sso
@RestController
public class HelloApplication {

    public static void main(final String[] args) {
        SpringApplication.run(HelloApplication.class, args);
    }

    private final OAuth2RestTemplate restTemplate;

    public HelloApplication(final OAuth2RestTemplate restTemplate) {
        this.restTemplate = Objects.requireNonNull(restTemplate);
    }

    @GetMapping
    public String sayHello(final Authentication a) {
        return restTemplate.getForObject("http://localhost:7070/resource/hello", String.class);
    }

    @Bean
    public static OAuth2RestTemplate oauth2RestTemplate(
            final OAuth2ProtectedResourceDetails resource,
            final OAuth2ClientContext context) {
        return new OAuth2RestTemplate(resource, context);
    }
}