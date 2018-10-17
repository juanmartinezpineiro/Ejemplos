/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploobjetos2;

/**
 *
 * @author jmartinezpineiro
 */
public class EjemploObjetos2 {

    private static boolean perimetro;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Instanciar
        Rectangulo objRect1 = new Rectangulo(3f,5f);
        Rectangulo objRect2 = new Rectangulo();
        float res = objRect1.area();
        
       
       System.out.println("La area del rectangulo es "+res);
       
       objRect2.setBase(7);
       objRect2.setAltura(10);
       
       System.out.println("Area del rectangulo es "+ objRect2.area());
       //Llamar a la clase del constructor por defecto
       objRect2.calcularPerimetro();
    
   
   
   
   
    }

   
   
    
}
