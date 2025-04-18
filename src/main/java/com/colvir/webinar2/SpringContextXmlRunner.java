package com.colvir.webinar2;

import com.colvir.webinar2.impl.TemperatureConverterImpl;
import com.colvir.webinar2.impl.ParametrizedConverterImpl;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringContextXmlRunner {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-context.xml");
        TemperatureConverter converter = context.getBean("temperatureConverter", TemperatureConverter.class);
        System.out.println("SpringContextXmlRunner, ConverterImpl");
        System.out.println(converter.toCls(100));
        System.out.println(converter.toFhr(100));

        ParametrizedConverterImpl converter1 = context.getBean(ParametrizedConverterImpl.class);
        System.out.println("SpringContextXmlRunner, ParametrizedConverterImpl");
        System.out.println(converter1.toCls());
        System.out.println(converter1.toFhr());

    }
}
