package com.colvir.webinar3.service;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

@Component
@Scope("prototype")
public class MedicalHistoryService {

    private final String treatmentStart;

    public MedicalHistoryService(){
        this.treatmentStart = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(Calendar.getInstance().getTime());
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public String showTreatmentStart() {
        return treatmentStart;
    }
}
