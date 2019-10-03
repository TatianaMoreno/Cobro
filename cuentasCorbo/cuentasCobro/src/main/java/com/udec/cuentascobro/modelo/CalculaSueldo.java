/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udec.cuentascobro.modelo;

import com.udec.cuentascobro.controlador.ingresoDatos;

/**
 *
 * @author AndresChila
 */
public class CalculaSueldo {

    private double sueldo;
    private String señore;
    private String idiomas;
    private double pagoProfesion;
    private ingresoDatos ingresodaDatos;

    //private ingresoDatos ingresodaDatos = new ingresoDatos();
    /**
     * Constructor de la clase
     *
     * @param ingreso
     */
    public CalculaSueldo(ingresoDatos ingreso) {
        this.ingresodaDatos = ingreso;
        validarSexo();
        calculaSueldo();
    }

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

    public void validarSexo() {
        if (ingresodaDatos.getGenero().equals("Masculino")) {
            setSeñore("Señor: ");
        } else {
            setSeñore("Señora: ");
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
            int subSueldo = 0;
            subSueldo = Integer.parseInt(Double.toString(getPagoProfesion())) * ingresodaDatos.getDiasLaborados();
            for (String s : ingresodaDatos.getIdiomas()) {
                subSueldo = subSueldo + Integer.parseInt(s);
            }
            subSueldo = subSueldo + Integer.parseInt(ingresodaDatos.getUbicacion());
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

    public String getSeñore() {
        return señore;
    }

    public void setSeñore(String señore) {
        this.señore = señore;
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

}
