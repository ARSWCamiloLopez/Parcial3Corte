/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.arsw.mvc_springtemplate.persistence.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import edu.eci.arsw.mvc_springtemplate.persistence.Parcial3CortePersistence;

/**
 *
 * @author camilo
 */
@Service
public class Parcial3CorteInMemoryPersistence implements Parcial3CortePersistence{

    @Override
    public Double deCelciusAFahrenheit(Double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    @Override
    public Double deFahrenheitACelsius(Double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }
    
    
    
}
