package com.diDemo.dependencyInjection.controllers;

import com.diDemo.dependencyInjection.services.GreetingService;
import com.diDemo.dependencyInjection.services.GreetingServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedController {
    @Autowired
    public GreetingService greetingServiceImpl;

    public String sayHello() {
        return greetingServiceImpl.sayGreeting();
    }
}
