/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.arsw.mvc_springtemplate.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import edu.eci.arsw.mvc_springtemplate.persistence.Parcial3CortePersistence;

/**
 *
 * @author camilo
 */
@Service
public class Parcial3CorteServicesStub implements Parcial3CorteServices{
    
    @Autowired
    Parcial3CortePersistence persistence;

    @Override
    public Double deCelciusAFahrenheit(Double celsius) {
        return persistence.deCelciusAFahrenheit(celsius);
    }

    @Override
    public Double deFahrenheitACelsius(Double fahrenheit) {
        return persistence.deFahrenheitACelsius(fahrenheit);
    }
    
}
