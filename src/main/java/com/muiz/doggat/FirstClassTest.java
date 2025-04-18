package com.muiz.doggat;

public class FirstClassTest {

    private String myVar;

    public FirstClassTest(String myVar) {
        this.myVar = myVar;
    }

    public String SayHello(){
        return "Hello from FirstClassTest ==> " + myVar;
    }
}