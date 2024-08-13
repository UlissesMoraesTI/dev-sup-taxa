package com.devsuperior.aula.services;

import org.springframework.stereotype.Service;

@Service
public class TaxService {

    public double tax(double amout) {
        return amout * 0.20;
    }
}
