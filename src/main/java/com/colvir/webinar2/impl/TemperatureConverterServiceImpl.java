package com.colvir.webinar2.impl;

import com.colvir.webinar2.TemperatureConverterService;
import com.colvir.webinar2.TemperatureConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TemperatureConverterServiceImpl implements TemperatureConverterService{

    @Autowired
    private TemperatureConverter temperatureConverter;

    /*public TemperatureConverterServiceImpl() {}

    @Autowired
    public TemperatureConverterServiceImpl(TemperatureConverter temperatureConverter){
        this.temperatureConverter = temperatureConverter;
    }*/

    @Override
    public void process() {
        System.out.println(temperatureConverter.toFhr(-1.1));
    }
}
