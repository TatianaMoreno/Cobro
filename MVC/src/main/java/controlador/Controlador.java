/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.Modelo;
import vista.vista;

/**
 *
 */
public class Controlador implements ActionListener {
    
    
    private vista view;
    private Modelo model;

    public Controlador(vista view, Modelo model) {
        this.view = view;
        this.model = model;
    }
    
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
