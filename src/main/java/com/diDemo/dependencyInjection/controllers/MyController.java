package com.diDemo.dependencyInjection.controllers;

import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    public String hello(){
        System.out.println("No Hello");
        return "Hello World";
    }
}
