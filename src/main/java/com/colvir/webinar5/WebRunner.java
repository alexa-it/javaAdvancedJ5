package com.colvir.webinar5;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class WebRunner {
    public static void main(String[] args) {
        SpringApplication.run(WebRunner.class, args);
    }
}
