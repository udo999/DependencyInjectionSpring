package com.example.dipendencyinjection.services.i18n;

import com.example.dipendencyinjection.services.GreetingService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
@Profile("EN")
@Service("i18nService")
public class EnglsihGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello everyone - EN";
    }
}
