package com.diDemo.dependencyInjection.services;

public class PrimaryGreetingservice implements GreetingService {

    private GrettingRepository greetingRepository;

    public PrimaryGreetingservice(GrettingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    @Override
    public String sayGreeting() {
        return greetingRepository.getEnglishGreeting();
    }
}
