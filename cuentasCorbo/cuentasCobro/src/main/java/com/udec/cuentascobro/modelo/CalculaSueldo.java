/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udec.cuentascobro.modelo;

import com.udec.cuentascobro.controlador.ingresoDatos;

/**
 *  Modelo que guarda la logica del proyecto
 * @author AndresChila, Tatiana Moreno
 */
public class CalculaSueldo {
    //Variable que guarda el valor del sueldo del usuario
    private int sueldo;
    //Variable que guarda tipo de encabezado para el recibo
    private String señore;
    //Variable que guarda los idiomas del usuario
    private String idiomas;
    //Variable que guarda el valor del pago por profesion del usuario
    private int pagoProfesion;
    //Variable tipo ingresoDatos 
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
        hallarPagoProfesion();
        concatenarIdiomas();
        calculaSueldo();
    }
    /**
     * Metodo que establece el valor de las profesiones
     */
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
    /**
     * Metodo que valida el tipo de encabezado segun el genero
     */
    public void validarSexo() {
        if (ingresodaDatos.getGenero().equals("Masculino")) {
            setSeñore("Señor: ");
        } else if((ingresodaDatos.getGenero().equals("Femenino"))){
            setSeñore("Señora: ");
        }
        else{
            setSeñore("Señor@");
        }
    }
    /**
     * Valida que los dias de trabajo sean mayores a 0
     * @return 
     */
    public boolean validarDiasTrabajados() {
        if (ingresodaDatos.getDiasLaborados() == 0) {
            setSueldo(0);
            return false;
        } else {
            return true;
        }
    }
    /**
     * Metodo que calcula el sueldo del usuario
     */
    public void calculaSueldo() {
        if (validarDiasTrabajados()) {
            int subSueldo = 0;
            subSueldo = getPagoProfesion() * ingresodaDatos.getDiasLaborados();
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
    /**
     * Metodo que une todos los idiomas que el usuario sabe 
     */
    public void concatenarIdiomas() {
        String subidioma = "";
        for (String s : ingresodaDatos.getIdiomas()) {
            subidioma = subidioma + s+", ";
        }
        setIdiomas(subidioma);
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
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

    public int getPagoProfesion() {
        return pagoProfesion;
    }

    public void setPagoProfesion(int pagoProfesion) {
        this.pagoProfesion = pagoProfesion;
    }

}
