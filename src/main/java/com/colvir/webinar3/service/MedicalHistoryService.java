package com.colvir.webinar3.service;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.Calendar;

import static org.springframework.context.annotation.ScopedProxyMode.TARGET_CLASS;

@Service
@Scope(value =ConfigurableBeanFactory.SCOPE_PROTOTYPE, proxyMode=TARGET_CLASS)
public class MedicalHistoryService {

    private Date treatmentStart = Calendar.getInstance().getTime();

    public Date getTreatmentStart() {
        return this.treatmentStart;
    }
}
