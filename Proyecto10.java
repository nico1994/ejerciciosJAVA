/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto10;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Proyecto10 {

    /**
     * @param args the command line arguments
     * Se ingresa la cantidad de ganadores de la loteria nacional y el 
     * monto total del premio,informar cuando dinero le corresponde a cada uno
     * 
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int ganadores;
        int premio;
        int dinero;
       
        Scanner misc= new Scanner(System.in);
        System.out.println("Cantidad de ganadores: ");
        ganadores= misc.nextInt();
        System.out.println("Monto total del premio; ");
        premio= misc.nextInt();
        dinero= (premio)/(ganadores);
        System.out.println("A cada persona que gano le corresponde: "+dinero+" pesos.");
        
    
        
        
    }
    
}
