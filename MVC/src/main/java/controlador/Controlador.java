/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.Modelo;
import vista.Vista;

/**
 *
 */
public class Controlador implements ActionListener {
    
    
    private Vista view;
    private Modelo model;

    public Controlador(Vista view, Modelo model) {
        this.view = view;
        this.model = model;
        this.view.bnMultiplicar.addActionListener(this);
    }
    
   public void iniciar(){
       view.setTitle("MVC Multiplicar");
       view.setLocationRelativeTo(null);
   } 
   public void actionPerformed(ActionEvent e){
       model.setNumero1(Integer.parseInt(view.txtNumeroUno.getText()));
       model.setNumero2(Integer.parseInt(view.txtNumeroDos.getText()));
       model.Multiplicar();
       view.txtResultado.setText(String.valueOf (model.getResultado()));
   }
    
    
}
