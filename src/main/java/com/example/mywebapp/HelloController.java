package com.example.mywebapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/hello")
    public String sayHello(String name) {
        System.out.println("name:"+name);
        return "Hello~"+name;
    }
    @GetMapping("/greetUser")
    public String greetUser(@RequestParam("name") String userName){
        return "Hello"+ userName+" ! Welcome to javaweb";
    }
    @GetMapping("/add")
    public int addnumber(@RequestParam(value ="a",defaultValue="0") int a,@RequestParam(value="b",defaultValue="0") int b){
        return a+b;
    }
}