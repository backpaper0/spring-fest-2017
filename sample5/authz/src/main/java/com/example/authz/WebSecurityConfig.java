package com.example.authz;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.stereotype.Component;

@Component
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(final HttpSecurity http) throws Exception {
        http
                .requestMatchers().antMatchers("/login", "/oauth/authorize")
                .and().authorizeRequests()
                .antMatchers("/login").permitAll()
                .antMatchers("/oauth/authorize").authenticated()
                .and().formLogin();
    }
}
