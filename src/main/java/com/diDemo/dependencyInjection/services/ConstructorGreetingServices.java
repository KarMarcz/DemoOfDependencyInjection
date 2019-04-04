package com.diDemo.dependencyInjection.services;

import org.springframework.stereotype.Service;

@Service
public class ConstructorGreetingServices implements GreetingService{
    @Override
    public String sayGreeting() {
        return "Injected Constructor";
    }
}
