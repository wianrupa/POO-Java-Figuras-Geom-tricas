/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figurageometrica;

/**
 *
 * @author Wilmer Ruiz  Clase Estructura de Datos
 * 
 */
public class Circulo {
    private double radio;
    //Constructor
    Circulo(){
        radio = 0;
    }
    //Get
    public double getRadio() {
        return radio;
    }
    public Circulo(double radio) {
        this.radio = radio;
    }
    //Set
    public void setRadio(double radio) {
        this.radio = radio;
    }
    //area
    public double area(){
        double a;
        a = Math.PI * Math.pow(radio,2);
        return a;
    }
    public double perimetro(){
        double p;
        p = 2 * Math.PI * radio;
        return p;
    }    
}
