/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto8;

import java.util.Scanner;

/**
 *
 * @author Sofia
 */
public class Proyecto8 {

    /**
     * @param args the command line arguments
     * Se piden el largo y el ancho de un terreno y se informa la superficie del mismo
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int largo;
        int ancho;
        int superficie;
        
        Scanner misc= new Scanner(System.in);
        System.out.println("Indique el largo del terreno: ");
        largo= misc.nextInt();
        System.out.println("Indique el ancho del terreno: ");
        ancho= misc.nextInt();
        superficie= largo * ancho;
        System.out.println("La superficie del terreno es: "+superficie);
        
       
    
        
        
    }
    
}
