package com.colvir.webinar3.model;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Patient {
    private Long id;
    private String name;
    private String diagnosis;
    private Date treatmentStart;

    public Date getTreatmentStart() {
        return treatmentStart;
    }

    public void setTreatmentStart(Date treatmentStart) {
        this.treatmentStart = treatmentStart;
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

    @Override
    public String toString() {
        return String. format("Patient = {name: %s, diagnosis: %s, treatment started at: %s}", name, diagnosis,
                new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(treatmentStart));
    }
}
