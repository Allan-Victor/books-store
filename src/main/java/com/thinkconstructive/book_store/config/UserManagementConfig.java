package com.thinkconstructive.book_store.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;


@Configuration
@EnableMethodSecurity
public class UserManagementConfig {

//    @Bean
//    public UserDetailsService userDetailsService(){
//        UserDetails userDetailsOne = User.withUsername("User1")
//                .password(passwordEncoder().encode("Pass1"))
//                .roles("USER")
//                .build();
//
//        var admin = User.withUsername("Admin")
//                .password(passwordEncoder().encode("admin"))
//                .roles("ADMIN")
//                .build();
//
//       return new InMemoryUserDetailsManager(userDetailsOne, admin);
//        }


    @Bean
    public PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();

    }
    }


