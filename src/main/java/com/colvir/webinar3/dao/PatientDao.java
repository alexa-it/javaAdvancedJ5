package com.colvir.webinar3.dao;

import com.colvir.webinar3.model.Patient;
import java.util.List;

public interface PatientDao {
    List<Patient> findAll();
    Patient findById(Long id);
    Patient save(Patient patient);
}
