package com.diDemo.dependencyInjection.controllers;

import com.diDemo.dependencyInjection.services.GreetingService;

public class SetterInjectedController {
    private GreetingService greetingService;

    String sayHello() {
        return greetingService.sayGreeting();
    }

    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }
}
