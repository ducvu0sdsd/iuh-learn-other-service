package com.iuh.dkhp.configs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http.authorizeHttpRequests(request -> {
            request.requestMatchers(HttpMethod.POST, "/api/v1/managements").permitAll()
                    .requestMatchers(HttpMethod.GET, "/api/v1/managements/find-by-id/{id}").permitAll()
                    .requestMatchers(HttpMethod.GET, "/api/v1/managements/find-by-username/{username}").permitAll()
                    .requestMatchers(HttpMethod.POST, "/api/v1/khoa").permitAll()
                    .requestMatchers(HttpMethod.DELETE, "/api/v1/khoa/{id}").permitAll()
                    .requestMatchers(HttpMethod.GET, "/api/v1/khoa").permitAll()
                    .requestMatchers(HttpMethod.POST, "/api/v1/khoa/update").permitAll()
                    .anyRequest().authenticated();
        });
        http.csrf(httpSecurityCsrfConfigurer -> httpSecurityCsrfConfigurer.disable());
        return http.build();
    }

}
