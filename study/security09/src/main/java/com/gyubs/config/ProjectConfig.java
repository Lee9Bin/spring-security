package com.gyubs.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.JdbcUserDetailsManager;

import javax.sql.DataSource;

@Configuration
public class ProjectConfig {
    //
    //
    // // @Bean
    // // UserDetailsService userDetailsService() {
    // //     // var user = User.withUsername("john")
    // //     //         .password("12345")
    // //     //         .authorities("read")
    // //     //         .build();
    // //     return new InMemoryUserDetailsManager(User.withUsername("gyub")
    // //             .password("12345")
    // //             .authorities("read")
    // //             .build());
    // // }
    // @Bean
    // public PasswordEncoder passwordEncoder() {
    //     return NoOpPasswordEncoder.getInstance();
    // }
    //
    //
    // // @Bean
    // // SecurityFilterChain configure(HttpSecurity http)
    // //         throws Exception {
    // //
    // //     http.httpBasic(Customizer.withDefaults());
    // //     http.authorizeHttpRequests(
    // //             c -> c.anyRequest().authenticated()
    // //     );
    // //
    // //     http.userDetailsService(new InMemoryUserDetailsManager(User.withUsername("gyub")
    // //             .password("12345")
    // //             .authorities("read")
    // //             .build()));
    // //
    // //     return http.build();
    // // }
    // private final CustomAuthenticationProvider authenticationProvider;
    //
    // public ProjectConfig(
    //         CustomAuthenticationProvider authenticationProvider) {
    //
    //     this.authenticationProvider = authenticationProvider;
    // }
    //
    // @Bean
    // SecurityFilterChain configure(HttpSecurity http)
    //         throws Exception {
    //
    //     http.httpBasic(Customizer.withDefaults());
    //     http.authorizeHttpRequests(
    //             c -> c.anyRequest().authenticated()
    //     );
    //
    //     return http.build();
    // }
    @Bean
    public UserDetailsService userDetailsService(DataSource dataSource) {
        return new JdbcUserDetailsManager(dataSource);
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return NoOpPasswordEncoder.getInstance();
    }
}
