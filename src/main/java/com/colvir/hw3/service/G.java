package com.colvir.hw3.service;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import java.util.Random;

import static org.springframework.context.annotation.ScopedProxyMode.TARGET_CLASS;

@Service
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE, proxyMode=TARGET_CLASS)
public class G {

    private Long id = new Random().nextLong();

    public Long getId() {
        return this.id;
    }
}
