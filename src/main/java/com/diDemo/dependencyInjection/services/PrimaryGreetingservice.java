package com.diDemo.dependencyInjection.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class PrimaryGreetingservice implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello - from primary";
    }
}