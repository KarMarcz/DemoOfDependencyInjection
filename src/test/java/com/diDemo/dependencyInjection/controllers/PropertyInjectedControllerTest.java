package com.diDemo.dependencyInjection.controllers;

import services.GreetingServiceImpl;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class PropertyInjectedControllerTest {

    private PropertyInjectedController propertyInjectedController;

    @Before
    public void setUp(){
        this.propertyInjectedController = new PropertyInjectedController();
        this.propertyInjectedController.greetingServiceImpl = new GreetingServiceImpl();
    }
    @Test
    public void greetingsTest() {
        assertEquals(GreetingServiceImpl.HELLO_KAROL, propertyInjectedController.sayHello());
    }

}
