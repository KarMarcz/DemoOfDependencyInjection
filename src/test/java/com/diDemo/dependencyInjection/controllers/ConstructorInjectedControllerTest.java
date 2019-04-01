package com.diDemo.dependencyInjection.controllers;

import services.GreetingServiceImpl;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConstructorInjectedControllerTest {

    private ConstructorInjectedController constructorInjectedController;

    @Before
    public void setUp(){
        constructorInjectedController = new ConstructorInjectedController(new GreetingServiceImpl());
    }
    @Test
    public void grettingsTest() {
        assertEquals(GreetingServiceImpl.HELLO_KAROL, constructorInjectedController.sayHello());
    }
}
