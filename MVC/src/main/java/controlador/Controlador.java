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
 * Clase controlador que detecta la vista y el modelo
 *@author Tatiana Moreno, Andres Chila
 */
public class Controlador implements ActionListener {
    
    //Se inicia una variable de tipo vista
    private Vista view;
    //Se inicia una variable de tipo modelo
    private Modelo model;
    /**
     * Constructor del controlador
     * @param view
     * @param model 
     */
    public Controlador(Vista view, Modelo model) {
        this.view = view;
        this.model = model;
        this.view.bnMultiplicar.addActionListener(this);
    }
    /**
     * Metodo que inicia la vista
     */
    public void iniciar(){
       view.setTitle("MVC Multiplicar");
       //Para poder posicionar la ventana 
       view.setLocationRelativeTo(null);
    } 
    /**
     * Metodo del llamdo del boton 
     * @param e 
     */
    public void actionPerformed(ActionEvent e){
       model.setNumero1(Integer.parseInt(view.txtNumeroUno.getText()));
       model.setNumero2(Integer.parseInt(view.txtNumeroDos.getText()));
       model.Multiplicar();
       view.txtResultado.setText(String.valueOf (model.getResultado()));
    }
    
    
}
