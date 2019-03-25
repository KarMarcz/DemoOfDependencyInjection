package com.diDemo.dependencyInjection.services;

import org.springframework.stereotype.Service;

@Service
public class SetterGreetingServices implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Injected by Setter";
    }
}
