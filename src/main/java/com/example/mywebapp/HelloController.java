package com.example.mywebapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/hello")
    public String sayHello(String name) {
        System.out.println("name:"+name);
        return "Hello~"+name;
    }
}