package com.muiz.doggat;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class MyFirstClass {
    public String SayHello(){
        return "Hello from my first class";
    };
}
