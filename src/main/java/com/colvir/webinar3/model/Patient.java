package com.colvir.webinar3.model;

import com.colvir.webinar3.service.MedicalHistoryService;

public class Patient {
    private Long id;
    private String name;
    private String diagnosis;
    private MedicalHistoryService medicalHistoryService;

    public MedicalHistoryService getMedicalHistoryService() {
        return medicalHistoryService;
    }

    public void setMedicalHistoryService(MedicalHistoryService medicalHistoryService) {
        this.medicalHistoryService = medicalHistoryService;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    private String showTreatmentStart(){
        return medicalHistoryService.showTreatmentStart();
    }

    @Override
    public String toString() {
        return String. format("Patient = {name: %s, diagnosis: %s, treatment started at: %s}", name, diagnosis, showTreatmentStart());
    }
}
