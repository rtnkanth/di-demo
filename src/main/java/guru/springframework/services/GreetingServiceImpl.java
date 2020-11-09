package guru.springframework.services;

public class GreetingServiceImpl implements GreetingService {

    public static final String HELLO_GURUS = "Hello Gurus!!!! - Original";

    @Override
    public String sayGreeting(){
        return HELLO_GURUS;
    }
}
