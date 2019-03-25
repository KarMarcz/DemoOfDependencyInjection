package com.diDemo.dependencyInjection.controllers;

import com.diDemo.dependencyInjection.services.GreetingServiceImpl;

public class ConstructorInjectedController {

    private GreetingServiceImpl greetingService;

    public ConstructorInjectedController(GreetingServiceImpl greetingService){
        this.greetingService = greetingService;
    }

    String sayHello(){
        return greetingService.sayGreeting();
    }
}
