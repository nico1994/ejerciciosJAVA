/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto5;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Proyecto5 {

    /**
     * @param args the command line arguments
     * Se necesita pedir dos numeros y sumarlos, mostrar el resultado.
     * 
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int primernumero;
        int segundonumero;
        int suma;
        Scanner Entradaxteclado= new Scanner(System.in);
        System.out.println("Ingrese el primer numero: ");
        primernumero= Entradaxteclado.nextInt();
        System.out.println("Ingrese el segundo numero:  ");
        segundonumero= Entradaxteclado.nextInt();
        suma= primernumero+segundonumero;
        System.out.println("La suma de los dos numeros es:  " +suma);
                
                
               
                
        
        
        
        
        
        
    }
    
}
