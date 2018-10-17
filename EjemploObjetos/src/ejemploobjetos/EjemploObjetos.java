/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploobjetos;

/**
 *
 * @author jmartinezpineiro
 */
public class EjemploObjetos {

    public static void main(String[] args) {
      //Instaciar un objeto de tipo Semaforo para acceder a la clase semaforo
      Semaforo unSemaforo = new Semaforo();
      unSemaforo.ponerColor("azul");
//      System.out.println("Color = "+unSemaforo.darColor());
      String respuesta = unSemaforo.darColor();
      System.out.println("Es de color "+respuesta);
      //tambien se puede resumir las dos ultimas lineas de codigos en una
       System.out.println("Es de color "+unSemaforo.darColor());
    }
    
}
