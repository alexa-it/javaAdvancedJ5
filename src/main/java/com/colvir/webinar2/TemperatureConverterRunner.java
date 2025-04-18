package com.colvir.webinar2;

import com.colvir.webinar2.impl.TemperatureConverterImpl;

public class TemperatureConverterRunner {
    public static void main(String[] args) {
        TemperatureConverter converter = new TemperatureConverterImpl();
        System.out.println("TemperatureConverterRunner");
        System.out.println(converter.toCls(10));
        System.out.println(converter.toFhr(10));
    }
}
