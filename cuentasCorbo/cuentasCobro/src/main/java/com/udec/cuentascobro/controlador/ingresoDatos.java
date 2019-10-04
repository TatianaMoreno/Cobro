/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udec.cuentascobro.controlador;

import javax.enterprise.context.RequestScoped;

import javax.inject.Named;
/**
 *  Clase controlador del ingreso de datos del usuario
 * @author Andres Chila, Tatiana Moreno
 */
@Named(value = "ingresoDatos")
@RequestScoped
public class ingresoDatos{
    //Variable que guarda el nombre del usuario
    private String nombre;
    //Variable que guarda el apellido del usuario
    private String apellido;
    //Variable que guarda la profesion del usuario
    private String profesion;
    //Variable que guarda el genero del usuario
    private String genero;
    //Variable que guarda los idiomas del usuario
    private String[] idiomas;
    //Variable que guarda la ubicacions del usuario
    private String ubicacion;
    //Variable que guarda los dias laborales del usuario
    private int diasLaborados;
    /**
     * Creates a new instance of ingresoDatos
     */
    public ingresoDatos() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String[] getIdiomas() {
        return idiomas;
    }

    public void setIdiomas(String[] idiomas) {
        this.idiomas = idiomas;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public int getDiasLaborados() {
        return diasLaborados;
    }

    public void setDiasLaborados(int diasLaborados) {
        this.diasLaborados = diasLaborados;
    }

    
    
}
