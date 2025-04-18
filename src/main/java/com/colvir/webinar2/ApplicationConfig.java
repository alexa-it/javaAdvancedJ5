package com.colvir.webinar2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.colvir.webinar2")
public class ApplicationConfig {

    @Bean("cls")
    public double cls() {
        return 10;
    }

    @Bean("fhr")
    public double fhr() {
        return 100;
    }

}