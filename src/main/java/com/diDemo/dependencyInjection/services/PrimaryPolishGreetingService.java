package com.diDemo.dependencyInjection.services;

public class PrimaryPolishGreetingService implements GreetingService {

    private GrettingRepository grettingRepository;

    public PrimaryPolishGreetingService(GrettingRepository grettingRepository) {
        this.grettingRepository = grettingRepository;
    }

    @Override
    public String sayGreeting() {
        return grettingRepository.getPolishGreeting();
    }

}
