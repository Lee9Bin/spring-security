package com.gyub.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class ProjectSecurityConfig {

    /**
     * 각 URL에 따른 요청 설정
     */
    // @Bean
    // SecurityFilterChain defaultSecurityFilterChain(HttpSecurity http) throws Exception {
    //     http.authorizeHttpRequests
    //                     ((requests) -> requests
    //                     .requestMatchers("/myAccount/**", "/myBalance", "/myLoans", "/myCards").authenticated()
    //                     .requestMatchers("/notices", "/contact").permitAll())
    //                     .formLogin(Customizer.withDefaults())
    //                     .httpBasic(Customizer.withDefaults());
    //     return http.build();
    // }

    /**
     * 모든 요청 거부
     * 정상적인 자격증명을 통해서 인증을 하더라도 403응답을 준다.
     * 이유는 인증과 인가에 대해서 파악해야한다.
     * 인증은 우리 사이트에 인증된 사람 즉, 정상적인 사용자인지 신분을 확인하는것이고
     * 인가는 인증된 사람들 중 접근 가능한 출입증을 주는 것이다.
     * 라고 우선 이해했다.
     */
    // @Bean
    // SecurityFilterChain defaultSecurityFilterChain(HttpSecurity http) throws Exception {
    //     http.authorizeHttpRequests
    //                     ((requests) -> requests
    //                             .anyRequest().denyAll())
    //             .formLogin(Customizer.withDefaults())
    //             .httpBasic(Customizer.withDefaults());
    //     return http.build();
    // }

    /**
     * 모든 요청 허용
     */
    @Bean
    SecurityFilterChain defaultSecurityFilterChain(HttpSecurity http) throws Exception {
        http.authorizeHttpRequests
                        ((requests) -> requests
                                .anyRequest().permitAll())
                .formLogin(Customizer.withDefaults())
                .httpBasic(Customizer.withDefaults());
        return http.build();
    }
}
