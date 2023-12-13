/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figurageometrica;

/**
 *
 * @author Wilmer Ruiz  Clase Estructura de Datos
 */
public class Triangulo {
    //Declarar atributos de la clase objeto
    private double l1,l2,l3;
    //Metodo constructor
    Triangulo(){
        l1 = 0;l2 = 0;l3 = 0;
    }
    //Metodos get
    public double getL1() {
        return l1;
    }
    public double getL2() {
        return l2;
    }
    public double getL3() {
        return l3;
    }
    //Metodos set
    public void setL1(double l1) {
        this.l1 = l1;
    }
    public void setL2(double l2) {
        this.l2 = l2;
    }
    public void setL3(double l3) {
        this.l3 = l3;
    }
    //Acciones
    public double area(){
        double s,a;
        s = (l1+l2+l3)/2;
        a = Math.sqrt(s+(s-l1)*(s-l2)*(s-l3));
        return a;
    }
    public double perimetro(){
        double p;
        p = l1+l2+l3;
        return p;
    }
    public boolean esTriangulo(){
        return l1 + l2 > l3 && l1 + l3 > l2 && l3 + l2 > l1;
    }
    public boolean esEquilatero(){
        return l1 == l2 && l2 == l3;
    }
    public boolean esEscaleno(){
        return l1 != l2 && l2 != l3 && l1 != l3;
    }
    public boolean   esIsoceles(){
     return l1 == l2 || l2 == l3 || l1==l3 ;
    }
}
