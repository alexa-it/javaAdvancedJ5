package com.colvir.webinar2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringBootRunner {
    public static void main(String[] args) {
        try (ConfigurableApplicationContext applicationContext = SpringApplication.run(SpringBootRunner.class, args)) {
            System.out.println("Print temperature converter result");
            System.out.println(applicationContext.getBean(TemperatureConverter.class).toCls(22));
            System.out.println(applicationContext.getBean(TemperatureConverter.class).toFhr(22));
        }
    }
}
