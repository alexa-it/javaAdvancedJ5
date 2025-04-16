package com.colvir.webinar2.impl;

import com.colvir.webinar2.Converter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

public class ConverterImpl implements Converter {
    @Override
    public double toCls(double fhr) {
        return (fhr - 32) * 5 / 9;
    }

    @Override
    public double toFhr(double cls) {
        return cls * 9 / 5 + 32;
    }
}
