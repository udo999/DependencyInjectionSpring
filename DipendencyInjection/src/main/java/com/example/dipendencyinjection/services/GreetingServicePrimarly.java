package com.example.dipendencyinjection.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
@Primary
@Service
public class GreetingServicePrimarly implements GreetingService{
    @Override
    public String sayGreeting() {
        return "Hello from the primally bean!";
    }
}
