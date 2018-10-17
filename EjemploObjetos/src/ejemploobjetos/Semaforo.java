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
public class Semaforo {
    private String color;
    
    //Metodos de acceso
    public String darColor(){ //getColor
        return color; 
    }
    public void ponerColor(String c){ //setColor
        color = c;
    }
}
