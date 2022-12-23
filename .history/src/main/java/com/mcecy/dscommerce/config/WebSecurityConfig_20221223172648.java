package com.mcecy.dscommerce.config;

import org.springframework.context.annotation.Configuration;

@Configuration
public class WebSecurityConfig {
    @Bean
    SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http.authorizeHttpRequests(auth -> auth.anyRequest().permitAll());
        http.headers().frameOptions().disable();
        http.csrf().disable();
        return http.build();
    }
}
