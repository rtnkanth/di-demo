package guru.springframework.services;

import org.springframework.stereotype.Service;

 @Service
public class ConstructorGreetingService implements GreetingService {

    @Override
    public String sayGreeting() {
        return "HELLO_GURUS - Constructor" ;
    }
}