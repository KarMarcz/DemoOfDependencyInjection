package com.diDemo.dependencyInjection.services;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;


public class PrimaryPolishGreetingService implements GreetingService {

    private GrettingRepository grettingRepository;

    public PrimaryPolishGreetingService(GrettingRepository grettingRepository) {
        this.grettingRepository = grettingRepository;
    }

    @Override
    public String sayGreeting() {
        return grettingRepository.getPolishGreeting();
    }

    @Bean
    @Primary
    @Profile({"default", "en"})
    GreetingService primaryGreetingService(GreetingServiceFactory greetingServiceFactory){
        return greetingServiceFactory.createGrettingService("en");
    }
    @Bean
    @Primary
    @Profile("pl")
    GreetingService primaryPolishGreetingService(GreetingServiceFactory greetingServiceFactory){
        return greetingServiceFactory.createGrettingService("pl");
    }
    @Bean
    @Primary
    @Profile( "cr")
    GreetingService primaryCroatiaGreetingService(GreetingServiceFactory greetingServiceFactory){
        return greetingServiceFactory.createGrettingService("cr");
    }
}
