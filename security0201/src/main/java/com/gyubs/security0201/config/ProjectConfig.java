package com.gyubs.security0201.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
public class ProjectConfig {

    @Bean
    UserDetailsService userDetailsService() {
        // var user = User.withUsername("john")
        //         .password("12345")
        //         .authorities("read")
        //         .build();
        return new InMemoryUserDetailsManager(User.withUsername("gyub")
                .password("12345")
                .authorities("read")
                .build());
    }
}
