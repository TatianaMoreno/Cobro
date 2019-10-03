/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udec.cuentascobro.controlador;

import com.udec.cuentascobro.modelo.CalculaSueldo;
import java.io.Serializable;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import javax.inject.Inject;

/**
 *
 * @author tmore
 */
@Named(value = "cuentaCobro")
@SessionScoped
public class cuentaCobro implements Serializable{

    /**
     * Creates a new instance of cuentaCobro
     */
    //private ingresoDatos ingresoDatos;
    @Inject
    private ingresoDatos ingresoDatos;
    private String sexo;
    private double sueldo;
    private String idiomasConcatenados;
    private ingresoDatos datos= new ingresoDatos();
    
        
    public cuentaCobro() {
        calculaSueldo();
    }
    public void calculaSueldo(){
        CalculaSueldo calcula = new CalculaSueldo(ingresoDatos);
        setSexo(calcula.getSeñore());
        setSueldo(calcula.getSueldo());
        setIdiomasConcatenados(calcula.getIdiomas());
    }
    public ingresoDatos getIngresoDatos() {
        return ingresoDatos;
    }

    public void setIngresoDatos(ingresoDatos ingresoDatos) {
        this.ingresoDatos = ingresoDatos;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public String getIdiomasConcatenados() {
        return idiomasConcatenados;
    }

    public void setIdiomasConcatenados(String idiomasConcatenados) {
        this.idiomasConcatenados = idiomasConcatenados;
    }
    
    
    
}
