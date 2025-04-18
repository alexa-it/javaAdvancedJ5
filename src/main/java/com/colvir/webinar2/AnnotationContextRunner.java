package com.colvir.webinar2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AnnotationContextRunner {
    public static void main(String[] args) {
        //ApplicationContext context = new AnnotationConfigApplicationContext("com.colvir.webinar2");
        ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
        TemperatureConverter temperatureConverter = context.getBean(TemperatureConverter.class);
        System.out.println("AnnotationContextRunner, TemperatureConverter");
        System.out.println(temperatureConverter.toCls(1));

        ParametrizedConverter parametrizedConverter = context.getBean(ParametrizedConverter.class);
        System.out.println("AnnotationContextRunner, ParametrizedConverter");
        System.out.println(parametrizedConverter.toFhr());
        System.out.println(parametrizedConverter.toCls());

        TemperatureConverterService temperatureConverterService = context.getBean(TemperatureConverterService.class);
        System.out.println("AnnotationContextRunner, TemperatureConverterService");
        temperatureConverterService.process();
    }
}
