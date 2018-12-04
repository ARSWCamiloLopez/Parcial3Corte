/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.arsw.mvc_springtemplate.controllers;

import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import edu.eci.arsw.mvc_springtemplate.services.Parcial3CorteServices;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author camilo
 */
@RestController
@RequestMapping(value = "/api")
public class Parcial3CorteApiController {

    @Autowired
    Parcial3CorteServices services;

    /**
     * Esta funcion permite cambiar los grados fahrenheit a celsius mediante una
     * petiicon GET de HTTP
     *
     * @param value El valor de los grados fahrenheit
     * @return Un codifo formato Json con el contenido de los grados celsius y
     * los grados fahrenheit
     */
    @RequestMapping(method = RequestMethod.GET, path = "/tocelsius/{value}")
    public ResponseEntity<?> deFahrenheitACelsius(@PathVariable("value") Double value) {
        try {
            Map<String, Double> resultado = new HashMap();

            resultado.put("Fahrenheit", value);
            resultado.put(("Celsius"), services.deFahrenheitACelsius(value));

            String codeToJson = new Gson().toJson(resultado);

            return new ResponseEntity<>(codeToJson, HttpStatus.ACCEPTED);
        } catch (Exception ex) {
            Logger.getLogger(Parcial3CorteApiController.class.getName()).log(Level.SEVERE, null, ex);
            return new ResponseEntity<>("No se ha podido realizar la coversion", HttpStatus.NOT_FOUND);
        }
    }

    /**
     * Esta funcion permite cambiar los grados celsius a fahrenheit mediante una
     * petiicon GET de HTTP
     *
     * @param value El valor de los grados celsius
     * @return Un codifo formato Json con el contenido de los grados celsius y
     * los grados fahrenheit
     */
    @RequestMapping(method = RequestMethod.GET, path = "/tofahrenheit/{value}")
    public ResponseEntity<?> deCelsiusAFahrenheit(@PathVariable("value") Double value) {
        try {
            Map<String, Double> resultado = new HashMap();

            resultado.put("Celsius", value);
            resultado.put(("Fahrenheit"), services.deCelciusAFahrenheit(value));

            String codeToJson = new Gson().toJson(resultado);

            return new ResponseEntity<>(codeToJson, HttpStatus.ACCEPTED);
        } catch (Exception ex) {
            Logger.getLogger(Parcial3CorteApiController.class.getName()).log(Level.SEVERE, null, ex);
            return new ResponseEntity<>("No se ha podido realizar la conversion", HttpStatus.NOT_FOUND);
        }
    }

}
