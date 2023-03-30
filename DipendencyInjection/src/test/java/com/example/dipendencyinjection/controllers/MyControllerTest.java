package com.example.dipendencyinjection.controllers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyControllerTest {
    @Test
    void satHello() {
        MyController myController = new MyController();
        System.out.println(myController.sayHello());
    }
}