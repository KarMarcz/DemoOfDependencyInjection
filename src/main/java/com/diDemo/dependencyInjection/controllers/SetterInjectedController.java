package com.diDemo.dependencyInjection.controllers;

import com.diDemo.dependencyInjection.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class SetterInjectedController {
    private GreetingService greetingService;

    public String sayHello() {
        return greetingService.sayGreeting();
    }
    @Autowired
    @Qualifier("setterGreetingServices")
    public void setGreetingService( GreetingService greetingService) {
        this.greetingService = greetingService;
    }
}
