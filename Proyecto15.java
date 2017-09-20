/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto15;

import java.util.Scanner;

/**
 *
 * @author Sofia
 */
public class Proyecto15 {

    /**
     * @param args the command line arguments
     * Se ingresa un importe. si supera los 100$ se le suma un 23% si es menor a 100$ 
     * se le descuenta el 50%
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner misc= new Scanner(System.in);
        String datoAux;
        Double importe;
        
        System.out.println("Ingrese el importe: ");
        datoAux= misc.next();
        importe= Double.parseDouble(datoAux);
        
        if (importe>100) {
        
        System.out.println( "El importe es: "+ (importe * 1.23));
        }
        else 
        {
        System.out.println("El importe es : " +  (importe * 0.50));
        
           
        
        
        }
        
        
        
        
    }
    
}
