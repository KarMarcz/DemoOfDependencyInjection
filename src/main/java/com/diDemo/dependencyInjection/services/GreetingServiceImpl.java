package com.diDemo.dependencyInjection.services;

public class GreetingServiceImpl implements GreetingService {

    public final static String HELLO_KAROL = "Hello Karol";

    @Override
    public String sayGreeting() {
        return HELLO_KAROL;
    }
}
