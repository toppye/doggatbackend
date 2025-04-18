package com.muiz.doggat;

import org.springframework.stereotype.Service;

@Service
public class MyFirstService {


    private final FirstClassTest firstClassTest;

    public MyFirstService(FirstClassTest firstClassTest) {
        this.firstClassTest = firstClassTest;
    }

    public String SayFirstservice(){
        return "From My FirstService calling Firstclass sayhello method ==> " + firstClassTest.SayHello();
    }
}
