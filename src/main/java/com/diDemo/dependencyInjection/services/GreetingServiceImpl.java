package com.diDemo.dependencyInjection.services;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl implements GreetingService {

    public final static String HELLO_KAROL = "Hello Karol";

    @Override
    public String sayGreeting() {
        return HELLO_KAROL;
    }
}
