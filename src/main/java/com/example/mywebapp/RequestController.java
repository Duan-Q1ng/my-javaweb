package com.example.mywebapp;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpServletRequest;
@RestController
public class RequestController {

    @RequestMapping("/request")
    public String request (HttpServletRequest request){
        //获取请求方式
        String method = request.getMethod();
        System.out.println("请求方式："+method);
        //获取请求URL
        String requesturl=request.getRequestURL().toString();
        System.out.println("请求URL: "+requesturl);
        String requesturi=request.getRequestURI();
        System.out.println("请求URI： "+requesturi);
        //获取请求协议
        String protocol = request.getProtocol();
        System.out.println("请求协议："+protocol);
        //获取请求参数
        String name = request.getParameter("name");
        System.out.println("name:"+name);
        String age=request.getParameter("age");
        System.out.println("age:"+age);
        //获取请求头
        String header = request.getHeader("User-Agent");
        
        System.out.println("User-Agent:"+header);
        String accept = request.getHeader("Accept");
        
        System.out.println("Accept:"+accept);
        return "OK";
    }
}
