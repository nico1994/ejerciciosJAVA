/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto16;

import java.util.Scanner;

/**
 *
 * @author Sofia
 */
public class Proyecto16 {

    /**
     * @param args the command line arguments
     * Se ingresa el importe de un pasaje de avion y el mes de viaje, si es enero se le descuenta un 10%
     * por temporada baja 
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner misc= new Scanner(System.in); 
        String datoAux;
        String mes;
        Double importe;
        
        System.out.println("Ingrese el importe del pasaje de avion: ");
        datoAux= misc.next();
        importe= Double.parseDouble(datoAux);
        
        System.out.println("Mes de viaje?: ");
        mes= misc.next();
        
        if (mes.equals("enero"))
           { 
            System.out.println("Su pasaje cuesta: "+ (importe * 0.90));}
        
        else 
          {  System.out.println("Su pasaje cuesta: " + importe);}
        
      
        
        
    }
    
}
