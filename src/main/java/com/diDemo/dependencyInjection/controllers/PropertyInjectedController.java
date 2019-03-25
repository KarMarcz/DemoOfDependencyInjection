package com.diDemo.dependencyInjection.controllers;

import com.diDemo.dependencyInjection.services.GreetingServiceImpl;

public class PropertyInjectedController {
    public GreetingServiceImpl greetingService;

    String sayHello() {
        return greetingService.sayGreeting();
    }
}
