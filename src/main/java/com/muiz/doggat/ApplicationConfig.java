package com.muiz.doggat;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {
    @Bean
    public FirstClassTest firstClassTest() {
        return new FirstClassTest("First beans or 12345");
    }
}
