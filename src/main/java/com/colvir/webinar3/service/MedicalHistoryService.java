package com.colvir.webinar3.service;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.Calendar;

@Service
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class MedicalHistoryService {

    private Date treatmentStart = Calendar.getInstance().getTime();

    public Date getTreatmentStart() {
        return this.treatmentStart;
    }
}
