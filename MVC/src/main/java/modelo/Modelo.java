/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *  Clase modelo
 * @author Tatiana Moreno, Andres Chila
 */
public class Modelo {
    //Guarda el valor del primer numero al que vamos a multiplicar 
    private int numero1;
    //Guarda el valor del segundo numero al que vamos a multiplicar 
    private int numero2;
    //Guarda el valor de la multiplicacion  
    private int resultado;
    
    public int getNumero1() {
        return numero1;
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public int getNumero2() {
        return numero2;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }

    public int getResultado() {
        return resultado;
    }

    public void setResultado(int resultado) {
        this.resultado = resultado;
    }
    
    /**
     * Es el metodo que realiza la multiplicacion 
     * @return el resultado de la multiplicacion
     */
    public int Multiplicar(){
        this.resultado=this.numero1*this.numero2;
            return this.resultado;
    }
}
