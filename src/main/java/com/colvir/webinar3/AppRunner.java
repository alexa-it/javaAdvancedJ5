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
            patient.setTreatmentStart(context.getBean(MedicalHistoryService.class).getTreatmentStart());

            service.save(patient);
            TimeUnit.SECONDS.sleep(1);

            Patient patient1 = new Patient();
            patient1.setName("Michael Snegirov");
            patient1.setDiagnosis("Allergy");
            patient1.setTreatmentStart(context.getBean(MedicalHistoryService.class).getTreatmentStart());

            service.save(patient1);
            TimeUnit.SECONDS.sleep(2);

            Patient patient2 = new Patient();
            patient2.setName("Elena Sidorova");
            patient2.setDiagnosis("Allergy");
            patient2.setTreatmentStart(context.getBean(MedicalHistoryService.class).getTreatmentStart());

            service.save(patient2);

            System.out.println("Show patients");
            service.findAll().forEach(System.out::println);
        };
    }
}
