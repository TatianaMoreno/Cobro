/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udec.cuentascobro.controlador;

import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.inject.Named;
import javax.enterprise.context.Dependent;

/**
 *
 * @author tmore
 */
@Named(value = "cuentaCobro")
@Dependent
public class cuentaCobro implements Serializable{

    /**
     * Creates a new instance of cuentaCobro
     */
    public cuentaCobro() {
    }
    /**
     * @PostConstruct para que la vista primero haga este metodo
     */
    @PostConstruct
    public void cargarDatos(){
        
    }
}
