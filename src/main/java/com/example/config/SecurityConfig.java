package com.example.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
            .csrf().disable()  // Disable CSRF for testing
            .authorizeHttpRequests()
            .requestMatchers("/api/encrypt", "/api/decrypt").permitAll()  // Allow these endpoints to bypass authentication
            .anyRequest().authenticated();  // Authenticate other requests

        return http.build();  // Return the HttpSecurity configuration
    }
}
