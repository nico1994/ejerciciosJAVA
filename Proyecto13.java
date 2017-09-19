/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto13;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Proyecto13 {

    /**
     * @param args the command line arguments
     * Se ingresa una edad y se informa si es mayor de edad
     * 
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String dato;
        Integer edad;
        Scanner misc= new Scanner(System.in);
        
        System.out.println("Ingrese su edad : ");
        dato= misc.next();
        edad= Integer.parseInt(dato);
        
        if ( edad > 17 ) {
            System.out.println("Usted es mayor");}
        else {
            System.out.println("Usted es menor");}
        
       
    }
    
}
