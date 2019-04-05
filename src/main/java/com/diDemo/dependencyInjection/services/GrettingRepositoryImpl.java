package com.diDemo.dependencyInjection.services;

import org.springframework.stereotype.Service;

@Service
public class GrettingRepositoryImpl implements GrettingRepository {

    @Override
    public String getEnglishGreeting() {
        return "Hello - from England";
    }

    @Override
    public String getPolishGreeting() {
        return "Siemanko z Polski";
    }

    @Override
    public String getCroatiaGreeting() {
        return "Dobrodošli iz Hrvatske službe";
    }
}
