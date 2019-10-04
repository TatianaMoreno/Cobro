/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udec.cuentascobro.controlador;

import com.udec.cuentascobro.modelo.CalculaSueldo;
import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
import javax.faces.bean.ManagedProperty;
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
    
    public cuentaCobro() {
    }
    @PostConstruct
    public void calculaSueldo(){
        CalculaSueldo calcular=new CalculaSueldo(ingresoDatos);
        sueldo=(int) calcular.getSueldo();
        idiomasConcatenados=calcular.getIdiomas();
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

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    public String getIdiomasConcatenados() {
        return idiomasConcatenados;
    }

    public void setIdiomasConcatenados(String idiomasConcatenados) {
        this.idiomasConcatenados = idiomasConcatenados;
    }
        
    
}
