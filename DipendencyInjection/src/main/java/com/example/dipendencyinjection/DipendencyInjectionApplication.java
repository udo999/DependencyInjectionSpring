package com.example.dipendencyinjection;

import com.example.dipendencyinjection.controllers.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DipendencyInjectionApplication {

    public static void main(String[] args) {

        ApplicationContext ctx = SpringApplication.run(DipendencyInjectionApplication.class, args);
        MyController controller = ctx.getBean(MyController.class);
        System.out.println("I'm in main method");
        System.out.println(controller.sayHello());

    }

}
