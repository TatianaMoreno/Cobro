/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udec.mvc;

import controlador.Controlador;
import modelo.Modelo;
import vista.Vista;

/**
 *  Clase que hace la ejecucion del programa
 * @author Tatiana Moreno, Andres Chila
 */
public class Main {
    public static void main(String args[]){
        //Se inicia el modelo
        Modelo mod = new Modelo();
        //Se inicia la vista
        Vista view = new Vista();
        //Se inicia el controlador a quien se le envian el modelo y la vista 
        Controlador crtl = new Controlador(view, mod);
        crtl.iniciar();
        //Se hace visible la vista
        view.setVisible(true);
    }
    
}
