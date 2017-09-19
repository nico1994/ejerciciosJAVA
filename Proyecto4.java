/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto4;

import java.util.Scanner;

/**
 *
 * @author Sofia
 */
public class Proyecto4 {

    /**
     * @param args the command line arguments
     * Al ingresar una edad y el nombre se debe mostrar el siguiente mensaje 
     * Usted se llama xxx y tiene xxx años de edad 
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int edad;
        String nombre;
        Scanner misc= new Scanner(System.in);
        System.out.println("Cual es su nombre?");
        nombre= misc.nextLine();
        System.out.println("Cual es su edad?");
        edad = misc.nextInt();
        System.out.println("Su nombre es "+nombre+" y su edad es "+edad);
        
        
        
        
        
        
        
        
        
        
    }
    
}
