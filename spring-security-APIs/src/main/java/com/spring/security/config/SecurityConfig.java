package com.spring.security.config;

import org.springframework.boot.autoconfigure.security.servlet.SecurityFilterAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig extends SecurityFilterAutoConfiguration {


    @Bean
    public SecurityFilterChain defaultFilterChain(HttpSecurity http) throws Exception {
       http.authorizeHttpRequests(authorizationManagerRequestMatcherRegistry ->
               authorizationManagerRequestMatcherRegistry
                       .requestMatchers("/account/myAccount/**",
                               "/balance/myBalance/**",
                               "/balance/myBalance/**",
                               "/cards/myCard/**",
                               "/loan/myLoan/**").authenticated()
                       .requestMatchers("/notices/myNotice/**",
                               "/contacts/myContact/**").permitAll());
       http.formLogin();
               http.httpBasic();

             return http.build();

    }
}
