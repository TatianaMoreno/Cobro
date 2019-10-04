/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udec.cuentascobro.modelo;

import com.udec.cuentascobro.controlador.cuentaCobro;
import com.udec.cuentascobro.controlador.ingresoDatos;
import javax.inject.Inject;

/**
 *
 * @author AndresChila
 */
public class CalculaSueldo {

    private double sueldo;
    private String idiomas;
    private double pagoProfesion;
    
    private ingresoDatos ingresodaDatos;
    
    /**
     * C de la clase
     * @param ingresodaDatos
     * @param cuentaCobro 
     */
    public CalculaSueldo(ingresoDatos ingresodaDatos) {
        this.ingresodaDatos = ingresodaDatos;
        
    }


    //private ingresoDatos ingresodaDatos = new ingresoDatos();
    
    
    

    public void hallarPagoProfesion() {
        if (ingresodaDatos.getProfesion().equals("Ingeniero")) {
            setPagoProfesion(200000);
        }
        if (ingresodaDatos.getProfesion().equals("Tecnologo")) {
            setPagoProfesion(150000);
        }
        if (ingresodaDatos.getProfesion().equals("Tecnico")) {
            setPagoProfesion(100000);
        }
        if (ingresodaDatos.getProfesion().equals("Auxiliar")) {
            setPagoProfesion(50000);
        }
    }

    

    public boolean validarDiasTrabajados() {
        if (ingresodaDatos.getDiasLaborados() == 0) {
            setSueldo(0);
            return false;
        } else {
            return true;
        }
    }

    public void calculaSueldo() {
        if (validarDiasTrabajados()) {
            double subSueldo = 0;
            subSueldo = Integer.parseInt(Double.toString(getPagoProfesion())) * ingresodaDatos.getDiasLaborados();
            for (String s : ingresodaDatos.getIdiomas()) {
                if(s.equals("Español"))
                    subSueldo = subSueldo + 0;
                if(s.equals("Ingles"))
                    subSueldo = subSueldo+250000;
                if(s.equals("Frances"))
                    subSueldo = subSueldo+330000;
                if(s.equals("Aleman"))
                    subSueldo = subSueldo+500000;
            }
            if(ingresodaDatos.getUbicacion().equals("Afuera"))
            subSueldo = subSueldo + 80000;
            setSueldo(subSueldo);
        }
    }

    public void concatenarIdiomas() {
        String subidioma = "";
        for (String s : ingresodaDatos.getIdiomas()) {
            subidioma = subidioma + " " + s;
        }
        setIdiomas(subidioma);
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    
    public String getIdiomas() {
        return idiomas;
    }

    public void setIdiomas(String idiomas) {
        this.idiomas = idiomas;
    }

    public double getPagoProfesion() {
        return pagoProfesion;
    }

    public void setPagoProfesion(double pagoProfesion) {
        this.pagoProfesion = pagoProfesion;
    }

    public ingresoDatos getIngresodaDatos() {
        return ingresodaDatos;
    }

    public void setIngresodaDatos(ingresoDatos ingresodaDatos) {
        this.ingresodaDatos = ingresodaDatos;
    }

    
    

}
