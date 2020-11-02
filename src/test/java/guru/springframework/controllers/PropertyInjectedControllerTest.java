package guru.springframework.controllers;

import guru.springframework.services.ConstructorGreetingService;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class PropertyInjectedControllerTest {

    private PropertyInjectedController propertyInjectedController;

    @Before
    public void setUp() throws Exception {
        this.propertyInjectedController = new PropertyInjectedController();
        this.propertyInjectedController.greetingService = new ConstructorGreetingService();
    }

    @Test
    public void testGreeting() throws Exception {
        System.out.println(propertyInjectedController.sayHello());
    }
}