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

    @GetMapping("/pathvar/{user-name}")
    public String pathvar(
            @PathVariable("user-name") String User_name
    ){
        return "this is the path variable : " + User_name;
    }

    //localhost:8080/param?user-name=toppye&last-name=myname
    @GetMapping("/param")
    public String param(
            @RequestParam("user-name") String userName,
            @RequestParam("last-name") String lastName
    ){
        return "request params are --> " + userName + " " + lastName;
    }
}
