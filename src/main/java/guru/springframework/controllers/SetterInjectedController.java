package guru.springframework.controllers;

import guru.springframework.services.GreetingService;
import guru.springframework.services.GreetingServiceImpl;


    public class SetterInjectedController {
        private GreetingService greetingService;

        public String sayHello(){
            return greetingService.sayGreeting();
        }
        public void setGreetingService(GreetingService greetingService) {
            this.greetingService = greetingService;
        }
    }