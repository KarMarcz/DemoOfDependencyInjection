package com.diDemo.dependencyInjection.controllers;

import com.diDemo.dependencyInjection.services.GreetingServiceImpl;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SetterInjectedControllerTest {

    private SetterInjectedController setterInjectedController;

    @Before
    public void setUp(){
        this.setterInjectedController = new SetterInjectedController();
        this.setterInjectedController.setGreetingService(new GreetingServiceImpl());
    }

    @Test
    public void greetingTest() {
        assertEquals(GreetingServiceImpl.HELLO_KAROL, setterInjectedController.sayHello());
    }
}
