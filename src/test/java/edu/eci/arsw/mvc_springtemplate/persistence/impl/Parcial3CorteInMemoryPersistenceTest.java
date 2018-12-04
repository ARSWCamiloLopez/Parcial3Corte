/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.arsw.mvc_springtemplate.persistence.impl;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author estudiante
 */
public class Parcial3CorteInMemoryPersistenceTest {
    
    public Parcial3CorteInMemoryPersistenceTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of deCelciusAFahrenheit method, of class Parcial3CorteInMemoryPersistence.
     */
    @Test
    public void testDeCelciusAFahrenheit() {
        System.out.println("deCelciusAFahrenheit");
        Double celsius = 10.0;
        Parcial3CorteInMemoryPersistence instance = new Parcial3CorteInMemoryPersistence();
        Double expResult = 50.0;
        Double result = instance.deCelciusAFahrenheit(celsius);
        assertEquals(expResult, result);
    }

    /**
     * Test of deFahrenheitACelsius method, of class Parcial3CorteInMemoryPersistence.
     */
    @Test
    public void testDeFahrenheitACelsius() {
        System.out.println("deFahrenheitACelsius");
        Double fahrenheit = 50.0;
        Parcial3CorteInMemoryPersistence instance = new Parcial3CorteInMemoryPersistence();
        Double expResult = 10.0;
        Double result = instance.deFahrenheitACelsius(fahrenheit);
        assertEquals(expResult, result);
    }
    
}
