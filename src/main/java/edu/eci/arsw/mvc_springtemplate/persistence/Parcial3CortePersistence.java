/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.arsw.mvc_springtemplate.persistence;

/**
 *
 * @author camilo
 */
public interface Parcial3CortePersistence {
    
    /**
     * Este metodo permite cambiar de grados celsius a fahrenheit.
     * @param celsius EL valor de los grados celsius.
     * @return El valor de los grandos convertidos a fahrenheit
     */
    public Double deCelciusAFahrenheit(Double celsius);
    
    /**
     * Este metodo permite cambiar de grados fahrenheit a celsius.
     * @param fahrenheit El valor de los grados fahrenheit
     * @return El valor de los grados convertidos a celsius.
     */
    public Double deFahrenheitACelsius(Double fahrenheit);
}
