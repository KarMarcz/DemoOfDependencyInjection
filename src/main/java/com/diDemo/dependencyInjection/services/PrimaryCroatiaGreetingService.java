package com.diDemo.dependencyInjection.services;

public class PrimaryCroatiaGreetingService implements GreetingService {

    private GrettingRepository grettingRepository;

    public PrimaryCroatiaGreetingService(GrettingRepository grettingRepository) {
        this.grettingRepository = grettingRepository;
    }


    @Override
    public String sayGreeting() {
        return grettingRepository.getCroatiaGreeting();
    }
}
