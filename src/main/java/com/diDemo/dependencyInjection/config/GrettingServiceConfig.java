package com.diDemo.dependencyInjection.config;

import com.diDemo.dependencyInjection.services.GreetingServiceFactory;
import com.diDemo.dependencyInjection.services.GrettingRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GrettingServiceConfig {

    @Bean
    GreetingServiceFactory greetingServiceFactory(GrettingRepository grettingRepository){
        return new GreetingServiceFactory(grettingRepository);
    }


}
