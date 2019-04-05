package com.diDemo.dependencyInjection.config;

import com.diDemo.dependencyInjection.services.GreetingService;
import com.diDemo.dependencyInjection.services.GreetingServiceFactory;
import com.diDemo.dependencyInjection.services.GrettingRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

@Configuration
public class GrettingServiceConfig {

    @Bean
    GreetingServiceFactory greetingServiceFactory(GrettingRepository grettingRepository){
        return new GreetingServiceFactory(grettingRepository);
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
