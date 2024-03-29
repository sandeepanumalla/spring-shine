package org.example.crudsprite;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Bean
    public SecurityFilterChain configuration(HttpSecurity httpSecurity) throws Exception {
        return httpSecurity.cors(AbstractHttpConfigurer::disable)
                .authorizeHttpRequests((request) -> request.anyRequest().permitAll())
                .formLogin(AbstractHttpConfigurer::disable)
                .build();
    }
}
