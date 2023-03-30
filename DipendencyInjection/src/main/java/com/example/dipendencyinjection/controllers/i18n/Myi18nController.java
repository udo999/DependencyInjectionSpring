package com.example.dipendencyinjection.controllers.i18n;

import com.example.dipendencyinjection.services.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class Myi18nController {
    private final GreetingService greetingService;


    public Myi18nController(@Qualifier("i18nService")GreetingService greetingService) {
        this.greetingService = greetingService;
    }
    public String sayHello(){
        return greetingService.sayGreeting();
    }
}
