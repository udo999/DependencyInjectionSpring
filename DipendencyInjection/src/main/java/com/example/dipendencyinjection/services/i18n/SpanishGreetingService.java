package com.example.dipendencyinjection.services.i18n;

import com.example.dipendencyinjection.services.GreetingService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
@Profile("ES")
@Service("i18nService")
public class SpanishGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Saludos mortales";
    }
}
