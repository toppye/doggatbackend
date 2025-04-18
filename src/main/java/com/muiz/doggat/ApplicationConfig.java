package com.muiz.doggat;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class ApplicationConfig {
    @Bean("bean1")
    public FirstClassTest firstClassTest() {
        return new FirstClassTest("First beans or 12345");
    }

    @Bean
    public FirstClassTest secondClassTest() {
        return new FirstClassTest("my second beans");
    }

    @Bean
    public FirstClassTest thirdClassTest() {
        return new FirstClassTest("my third beans");
    }
}
