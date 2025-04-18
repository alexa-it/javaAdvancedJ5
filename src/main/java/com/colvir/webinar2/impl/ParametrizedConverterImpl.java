package com.colvir.webinar2.impl;

import com.colvir.webinar2.ParametrizedConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("parametrizedConverter")
public class ParametrizedConverterImpl implements ParametrizedConverter {

    private double fhr = 53;
    private double cls = 47;

    @Autowired
    public ParametrizedConverterImpl(@Qualifier("fhr") double fhr, @Qualifier("cls") double cls){
        this.fhr = fhr;
        this.cls = cls;
    }

    public double toCls() {
        return (fhr - 32) * 5 / 9;
    }

    public double toFhr() {
        return cls * 9 / 5 + 32;
    }
}
