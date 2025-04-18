package com.muiz.doggat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class MyFirstService {

    private FirstClassTest firstClassTest;

    @Autowired
    public void setFirstClassTest(
            @Qualifier("bean1") FirstClassTest firstClassTest
    ){
        this.firstClassTest = firstClassTest;
    }

//    public MyFirstService(@Qualifier("1") FirstClassTest firstClassTest) {
//        this.firstClassTest = firstClassTest;
//    }

    public String SayFirstservice(){
        return "From My FirstService calling Firstclass sayhello method ==> " + firstClassTest.SayHello();
    }
}