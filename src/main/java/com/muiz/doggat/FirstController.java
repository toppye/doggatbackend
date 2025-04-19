package com.muiz.doggat;

import org.springframework.web.bind.annotation.*;

@RestController
public class FirstController {

    @GetMapping("/hello")
    public String Sayhello(){
        return "hello from my first controller";
    }

    @PostMapping("/orderrecord")
    public String orderrecord(
           @RequestBody Order_record order
    ){
        return "The message from my first controller : " + order.toString();
    }

    @PostMapping("/post/order")
    public String postorder(
            @RequestBody Order order
    ){
        return "The message from my first controller : " + order.toString();
    }

    @PostMapping("/post")
    public String post(
            @RequestBody String message
    ){
        return "The message from my first controller : " + message;
    }



}
