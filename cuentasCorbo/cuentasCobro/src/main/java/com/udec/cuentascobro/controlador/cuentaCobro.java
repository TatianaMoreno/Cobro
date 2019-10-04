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
 *  Controlador de la vista que realiza la cuanta de cobro
 * @author Andres Chila, Tatiana Moreno
 */
@Named(value = "cuentaCobro")
@RequestScoped//Se hace la peticion al responder y devolver la infromacion del cliente muere en la memoria. 
public class cuentaCobro{
    //Variable que guarda el genero del usuario
    private String sexo;
    //Variable que guarda el sueldo del usuario
    private double sueldo;
    //Variable que guarda los idiomas del usuario
    private String idiomasConcatenados;
    //La inyeccion de los datos que ingreso el usuario
    @Inject
    private ingresoDatos ingresoDatos;

    /**
     * Metodo que calcula el sueldo y que se ejecuta despues del constructor
     */
    @PostConstruct
    public void calculaSueldo() {
        CalculaSueldo calcula = new CalculaSueldo(ingresoDatos);
        setSexo(calcula.getSeñore());
        setSueldo(calcula.getSueldo());
        setIdiomasConcatenados(calcula.getIdiomas());
    }
    //Get de la variable sexo
    public String getSexo() {
        return sexo;
    }
    //Set de la variable sexo
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    //Get de la variable sueldo
    public double getSueldo() {
        return sueldo;
    }
    //Set de la variable sueldo
    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }
    //Get de la variable idiomaConcatenado
    public String getIdiomasConcatenados() {
        return idiomasConcatenados;
    }
    //Set de idiomasConcatenados
    public void setIdiomasConcatenados(String idiomasConcatenados) {
        this.idiomasConcatenados = idiomasConcatenados;
    }
    //Get de ingresoDatos
    public ingresoDatos getIngresoDatos() {
        return ingresoDatos;
    }
    //Set de ingresoDatos
    public void setIngresoDatos(ingresoDatos ingresoDatos) {
        this.ingresoDatos = ingresoDatos;
    }
    
}
