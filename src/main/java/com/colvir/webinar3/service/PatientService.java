package com.colvir.webinar3.service;

import com.colvir.webinar3.dao.PatientDao;
import com.colvir.webinar3.model.Patient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.Random;

@Service
public class PatientService {

    private final PatientDao patientDao;
    private static final Random RANDOM = new Random();

    private MedicalHistoryService medicalHistoryService;

    public MedicalHistoryService getMedicalHistoryService() {
        return medicalHistoryService;
    }

    public PatientService(PatientDao patientDao, MedicalHistoryService medicalHistoryService) {
        System.out.println("PatientService constructor called");
        this.patientDao = patientDao;
        this.medicalHistoryService = medicalHistoryService;
    }

    public void save(Patient patient) {
        if (patient.getId() == null) {
            patient.setId(RANDOM.nextLong());
        }
        patientDao.save(patient);
    }

    public List<Patient> findAll(){
        return patientDao.findAll();
    }

}
