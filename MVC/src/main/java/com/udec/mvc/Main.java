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
 *
 * @author tmore
 */
public class Main {
    public static void main(String args[]){
        
        Modelo mod = new Modelo();
        Vista view = new Vista();
        
        Controlador crtl = new Controlador(view, mod);
        crtl.iniciar();
        view.setVisible(true);
    }
    
}
