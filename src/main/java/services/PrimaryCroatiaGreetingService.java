package services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("cro")
@Primary
public class PrimaryCroatiaGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Dobrodošli iz Hrvatske službe";
    }
}
