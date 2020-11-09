package guru.springframework.services;

import org.springframework.stereotype.Component;

@Component
public class GreetingRepositoryImpl implements GreetingRepository {

    @Override
    public String getEnglishGreeting(){
        return "Hello -- Primary Greeting Service";
    }

    @Override
    public String getSpanishGreeting(){
        return "Hola Amor -- Servicio de Saludo Primario";
    }

    @Override
    public String getGermanGreeting(){
        return "Hallo -- Primärer Grußdienst";
    }
}
