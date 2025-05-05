package com.colvir.webinar4;

import com.colvir.webinar4.service.ArchiverService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.io.IOException;

@SpringBootApplication
public class SpringBootRunner {
    public static void main(String[] args) {
        try (ConfigurableApplicationContext applicationContext = SpringApplication.run(SpringBootRunner.class, args)) {
            applicationContext.getBean(ArchiverService.class).archiveFile("compression/", "test1.txt", "compressed1.zip");
        } catch (IOException e) {
            System.out.println("Exception:" + e.getMessage());
        }
    }
}
