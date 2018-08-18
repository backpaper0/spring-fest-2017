package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
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

@Configuration
class Hello2Config extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(final HttpSecurity http)
            throws Exception {
        http.authorizeRequests()
                .anyRequest().authenticated()
                .and().oauth2Login()
        //                .clientRegistrationRepository(clientRegistrationRepository())
        ;
    }

    //    @Bean
    //    public ClientRegistrationRepository clientRegistrationRepository() {
    //        final ClientRegistration registration = ClientRegistration
    //                .withRegistrationId("hello")
    //                .clientName("HELLO")
    //                .clientId("hello")
    //                .clientSecret("secret")
    //                .scope("user")
    //                .authorizationGrantType(AuthorizationGrantType.AUTHORIZATION_CODE)
    //                .authorizationUri("http://localhost:9090/authz/oauth/authorize")
    //                .tokenUri("http://localhost:9090/authz/oauth/token")
    //                .redirectUriTemplate("http://localhost:8080/login/oauth2/code/hello")
    //                .userInfoUri("http://localhost:9090/authz/userinfo")
    //                .userNameAttributeName("name")
    //                .build();
    //        return new InMemoryClientRegistrationRepository(registration);
    //    }
}
