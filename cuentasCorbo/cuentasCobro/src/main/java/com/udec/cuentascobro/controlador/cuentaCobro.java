/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udec.cuentascobro.controlador;

import com.udec.cuentascobro.modelo.CalculaSueldo;
import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;

import javax.inject.Named;
import javax.inject.Inject;

/**
 *
 * @author tmore
 */
@Named(value = "cuentaCobro")
@RequestScoped
public class cuentaCobro{

    private String sexo;
    private double sueldo;
    private String idiomasConcatenados;
    
    @Inject
    private ingresoDatos ingresoDatos;

    
    @PostConstruct
    public void calculaSueldo() {
        CalculaSueldo calcula = new CalculaSueldo(ingresoDatos);
        setSexo(calcula.getSeñore());
        setSueldo(calcula.getSueldo());
        setIdiomasConcatenados(calcula.getIdiomas());
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

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    public String getIdiomasConcatenados() {
        return idiomasConcatenados;
    }

    public void setIdiomasConcatenados(String idiomasConcatenados) {
        this.idiomasConcatenados = idiomasConcatenados;
    }

    public ingresoDatos getIngresoDatos() {
        return ingresoDatos;
    }

    public void setIngresoDatos(ingresoDatos ingresoDatos) {
        this.ingresoDatos = ingresoDatos;
    }
    
}
