package com.muiz.doggat;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {
    public FirstClassTest firstClassTest() {
        return new FirstClassTest();
    }
}
