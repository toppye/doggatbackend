package com.muiz.doggat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

@Service
public class MyFirstService {

    private FirstClassTest firstClassTest;

    private Environment environment;

    @Autowired
    public void setFirstClassTest(
            @Qualifier("bean1") FirstClassTest firstClassTest
    ){
        this.firstClassTest = firstClassTest;
    }

    public String SayFirstservice(){
        return "From My FirstService calling Firstclass sayhello method ==> " + firstClassTest.SayHello();
    }

    public String getjavaversion(){
        return environment.getProperty("java.version");
    }

    public String osversion(){
        return environment.getProperty("os.version");
    }

    public String readprop(){
        return environment.getProperty("spring.application.name");
    }

    @Autowired
    public void setEnvironment(Environment environment) {
        this.environment = environment;
    }
}