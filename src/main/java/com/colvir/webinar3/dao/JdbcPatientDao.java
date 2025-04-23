package com.colvir.webinar3.dao;

import com.colvir.webinar3.model.Patient;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository("jdbcDao")
public class JdbcPatientDao implements PatientDao{
    private List<Patient> patients = new ArrayList<>();

    @Override
    public List<Patient> findAll() {
        return patients;
    }

    @Override
    public Patient findById(Long id) {
        return null;
    }

    @Override
    public Patient save(Patient patient) {
        patients.add(patient);
        return patient;
    }
}
