package com.example.dipendencyinjection.controllers.i18n;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@ActiveProfiles("EN")
@SpringBootTest
public class myi18nControllerTestEN {
    @Autowired
    Myi18nController myi18nController;


    @Test
    void sayHello() {
        System.out.println(myi18nController.sayHello());

    }
}
