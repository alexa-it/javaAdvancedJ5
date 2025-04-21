package com.colvir.webinar3.service;

import com.colvir.webinar3.dao.PatientDao;
import com.colvir.webinar3.model.Patient;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.Random;

@Service
@Scope("singleton")
public class PatientService {

    private final PatientDao patientDao;
    private static final Random RANDOM = new Random();

    private MedicalHistoryService medicalHistoryService;

    public PatientService(Map<String, PatientDao> patientDao, MedicalHistoryService medicalHistoryService
    ) {
        System.out.println("PatientService constructor called");
        this.patientDao = patientDao.values().stream().findFirst().orElse(null);
        this.medicalHistoryService = medicalHistoryService;
    }

    public void save(Patient patient, MedicalHistoryService medicalHistoryService) {
        if (patient.getId() == null) {
            patient.setId(RANDOM.nextLong());
        }
        patient.setMedicalHistoryService(medicalHistoryService);
        patientDao.save(patient);
    }

    public List<Patient> findAll(){
        return patientDao.findAll();
    }


}
