package com.diDemo.dependencyInjection.services;

public class GreetingServiceFactory {

    private GrettingRepository grettingRepository;

    public GreetingServiceFactory(GrettingRepository grettingRepository) {
        this.grettingRepository = grettingRepository;
    }

    public GreetingService createGrettingService(String lang){
        switch (lang){
            case "en":
                return new PrimaryGreetingservice(grettingRepository);
            case "pl":
                return new PrimaryPolishGreetingService(grettingRepository);
            case "cr":
                return new PrimaryCroatiaGreetingService(grettingRepository);
                default:
                    return new PrimaryGreetingservice(grettingRepository);
        }
    }
}
