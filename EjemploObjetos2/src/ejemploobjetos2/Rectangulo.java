/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploobjetos2;

import java.util.Scanner;

/**
 *
 * @author jmartinezpineiro
 */
public class Rectangulo {
    
    //atributos en privado siempre
    private float base,altura;
    
    //Constructores 
    //Por defecto
    public Rectangulo(){
        
        
    }
    
    public Rectangulo(float bas,float al){
        base= bas;
        altura= al;
        
    }
    //Metodos de acceso
    public void setBase(float bas){
        base = bas;
    }
    public float getBase(){
        return base;
    }
    public void setAltura(float al){
        altura = al;
    }
    public float getAltura (){
        return altura;
    }
    public float area(){
        float area;
        area = base*altura;
        return area;
        
    }
    //Constructor por defecto
    public void calcularPerimetro(){
       //Llamar a Scanner
       Scanner leer = new Scanner (System.in);
       //Declarar base,altura
       
       //Pedir por teclado
       System.out.println("Introduzca la base:");
       float base = leer.nextFloat();
       System.out.println("Introduzca la altura");
       float altura = leer.nextFloat();
       //Formula perimetro
       System.out.println("perimetro = "+(2*base+2*altura));
       
       
       
        
    }
}
