package com.colvir.webinar2;

import com.colvir.webinar2.impl.ConverterImpl;

public class ConverterRunner {
    public static void main(String[] args) {
        Converter converter = new ConverterImpl();
        System.out.println("ConverterRunner");
        System.out.println(converter.toCls(10));
        System.out.println(converter.toFhr(10));
    }
}
