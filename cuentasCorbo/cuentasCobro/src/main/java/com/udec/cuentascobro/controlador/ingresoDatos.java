/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udec.cuentascobro.controlador;


import java.io.Serializable;;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;
/**
 *
 * @author tmore
 */
@Named(value = "ingresoDatos")
@SessionScoped
public class ingresoDatos implements Serializable{
    private String nombre;
    private String apellido;
    private String profesion;
    private String genero;
    private String[] idiomas;
    private String ubicacion;
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
