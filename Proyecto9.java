/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto9;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Proyecto9 {

    /**
     * @param args the command line arguments
     * Se ingresa la cantidad y el precio de un producto y se informa el total a pagar
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String datoAux;
        Integer cantidad;
        Double Precio;
        Double total;
      
        Scanner misc= new Scanner(System.in);
        
        System.out.println("Ingrese la cantidad del producto: ");    
        datoAux= misc.next();
        cantidad= Integer.parseInt(datoAux);
        
        System.out.println("Ingrese el precio del producto: ");
        datoAux= misc.next();
        Precio= Double.parseDouble(datoAux);
        
        total= (cantidad)*(Precio);
        System.out.println("El total a pagar es: "+total);

    }
    
}
