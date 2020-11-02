package guru.springframework.controllers;

import guru.springframework.services.ConstructorGreetingService;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class ConstructorInjectedControllerTest {
    private ConstructorInjectedController constructorInjectedController;

    @Before
    public void setUp() throws Exception {
        this.constructorInjectedController = new ConstructorInjectedController(new ConstructorGreetingService());
    }

    @Test
    public void testGreeting() throws Exception {
        System.out.println(constructorInjectedController.sayHello());
    }
}
