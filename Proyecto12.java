/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto12;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Proyecto12 {

    /**
     * @param args the command line arguments
     * Se ingresa el importe de un producto importado y se le debe agregar el 35%
     * de impuestos internos
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String datoAux;
        Double precio;
        Double preciofinal;
        
        Scanner misc= new Scanner(System.in);
        
        System.out.println("Ingrese el importe del producto: ");
        datoAux= misc.next();
        precio= Double.parseDouble(datoAux);
    
        preciofinal= precio +(precio*35) / 100;
        System.out.println("El valor es: "+preciofinal);
        
       
        
       
        
    }
    
}
