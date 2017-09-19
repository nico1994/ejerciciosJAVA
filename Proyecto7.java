/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto7;

import java.util.Scanner;

/**
 *
 * @author Sofia
 */
public class Proyecto7 {

    /**
     * @param args the command line arguments
     * Se pide la base de un cuadrado y se informa el perimetro
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int cuadrado;
        int perimetro;
     
       
        Scanner misc= new Scanner(System.in);
        System.out.println("Cual es la base del cuadrado? ");
        cuadrado= misc.nextInt();
        perimetro= (cuadrado)*4 ;
        System.out.println("El perimetro es: "+perimetro);
        
        
        
        
                
        
        
        
    }
    
}
