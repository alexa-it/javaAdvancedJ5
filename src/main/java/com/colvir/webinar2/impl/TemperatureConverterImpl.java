package com.colvir.webinar2.impl;

import com.colvir.webinar2.TemperatureConverter;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class TemperatureConverterImpl implements TemperatureConverter {
    @Override
    public double toCls(double fhr) {
        return (fhr - 32) * 5 / 9;
    }

    @Override
    public double toFhr(double cls) {
        return cls * 9 / 5 + 32;
    }
}
