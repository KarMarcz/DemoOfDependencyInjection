package com.diDemo.dependencyInjection.controllers;

import com.diDemo.dependencyInjection.services.GreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    private GreetingService greetingService;

    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String hello(){
        System.out.println("No Hello");
        return greetingService.sayGreeting();
    }
}
