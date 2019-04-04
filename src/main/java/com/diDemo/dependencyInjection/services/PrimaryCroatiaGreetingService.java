package com.diDemo.dependencyInjection.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;


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
