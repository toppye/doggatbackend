package com.muiz.doggat;

import org.springframework.web.bind.annotation.*;

@RestController
public class FirstController {

    @GetMapping("/hello")
    public String Sayhello(){
        return "hello from my first controller";
    }

    @PostMapping("/post")
    public String post(
           @RequestBody Order order
    ){
        return "The message from my first controller : " + order.toString();
    }

}
