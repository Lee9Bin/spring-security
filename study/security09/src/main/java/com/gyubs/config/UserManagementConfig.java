package com.gyubs.config;

import org.springframework.context.annotation.Configuration;

@Configuration
public class UserManagementConfig {
    // @Bean
    // public UserDetailsService userDetailsService() {
    //     var userDetailsService = new InMemoryUserDetailsManager();
    //
    //     userDetailsService.createUser(User.withUsername("gyub")
    //             .password("12345")
    //             .authorities("read")
    //             .build());
    //     return userDetailsService;
    // }
    //
    // @Bean
    // public PasswordEncoder passwordEncoder() {
    //     return NoOpPasswordEncoder.getInstance();
    // }
}
