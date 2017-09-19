/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto6;

import java.util.Scanner;

/**
 *
 * @author Sofia
 */
public class Proyecto6 {

    /**
     * @param args the command line arguments
     * Se piden tres numeros y se informa el promedio.
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numero1;
        int numero2;
        int numero3;
        int Promedio;
        
        Scanner misc= new Scanner(System.in);
        System.out.println("Ingrese el primer numero: ");
        numero1= misc.nextInt();
        System.out.println("Ingrese el segundo numero:");
        numero2= misc.nextInt();
        System.out.println("Ingrese el tercer numero: ");
        numero3= misc.nextInt();
        Promedio= (numero1+numero2+numero3) / 3;
        System.out.println("Su promedio es: "+Promedio);
                
        
        
        
        
    }
    
}
