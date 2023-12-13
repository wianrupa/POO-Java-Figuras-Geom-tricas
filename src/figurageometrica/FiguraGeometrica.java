/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figurageometrica;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Wilmer Ruiz  Clase Estructura de Datos
 */
public class FiguraGeometrica {
    static Scanner entrada = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int op;
        System.out.println("Menu Principal\n 1. Triagulo\n 2. Circulo 3. Rectangulo\n 4. Salir\n Digite la opcion:");
        op = entrada.nextInt();
        switch(op){
            case 1:
                triangulo();
                break;
            case 2: 
                circulo();
                break;
            case 3:
                rectangulo();
                break;
            case 4:
                break;
        }
        
    }
    //metodos
    public static void triangulo(){
        //Declarar el objeto triangulo
        Triangulo t = new Triangulo();
        //Pidiendo y guardando los lados del triangulo
        System.out.println("Digite lado uno:");
        t.setL1(entrada.nextDouble());
        System.out.println("Digite lado dos:");
        t.setL2(entrada.nextDouble());
        System.out.println("Digite lado tres:");
        t.setL3(entrada.nextDouble());
        if(t.esTriangulo()){
            System.out.println("El area del triangulo es:"+t.area());
            System.out.println("El perimetro del triangulo es: "+t.perimetro());
            if(t.esEquilatero()){
                System.out.println("Es equilatero");
            }
            else{
                if(t.esEscaleno()){
                    System.out.println("Es escaleno");
                }
                else{
                    System.out.println("Es Isoceles");
                }
            }
        }
        else{
            System.out.println("No es un triangulo");
        }
    }
    public static void circulo(){
        //Declarar el objeto circulo
        Circulo c = new Circulo();
        System.out.println("Digite el radio del circulo:");
        c.setRadio(entrada.nextDouble());
        System.out.println("El area del circulo es:"+c.area());
        System.out.println("El perimetro del circulo es:"+c.perimetro());
    }
    public static void rectangulo(){
        
    }
}
