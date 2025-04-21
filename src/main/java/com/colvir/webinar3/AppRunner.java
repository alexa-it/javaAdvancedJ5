package com.colvir.webinar3;

import com.colvir.webinar3.config.AppConfig;
import com.colvir.webinar3.model.Patient;
import com.colvir.webinar3.service.MedicalHistoryService;
import com.colvir.webinar3.service.PatientService;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.concurrent.TimeUnit;

public class AppRunner {
    public static void main(String[] args) throws InterruptedException {
        try (ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class)) {
            PatientService service = context.getBean(PatientService.class);
            Patient patient = new Patient();
            patient.setName("Anna Belova");
            patient.setDiagnosis("Sunstroke");

            service.save(patient, context.getBean(MedicalHistoryService.class));
            TimeUnit.SECONDS.sleep(5);

            Patient patient1 = new Patient();
            patient1.setName("Michael Snegirov");
            patient1.setDiagnosis("Allergy");

            service.save(patient1, context.getBean(MedicalHistoryService.class));
            TimeUnit.SECONDS.sleep(5);

            Patient patient2 = new Patient();
            patient2.setName("Elena Sidorova");
            patient2.setDiagnosis("Allergy");

            service.save(patient2, context.getBean(MedicalHistoryService.class));

            System.out.println("Show patients");
            service.findAll().forEach(System.out::println);
        };
    }
}
