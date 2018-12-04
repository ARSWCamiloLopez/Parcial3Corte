/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.arsw.mvc_springtemplate.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import edu.eci.arsw.mvc_springtemplate.services.Parcial3CorteServices;

/**
 *
 * @author camilo
 */
@RestController
@RequestMapping(value = "/template")
public class Parcial3CorteApiController {

    @Autowired
    Parcial3CorteServices services;
    
}
