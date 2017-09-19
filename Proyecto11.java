/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto11;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Proyecto11 {

    /**
     * @param args the command line arguments
     * Se pide el valor de la hora de trabajo de un empleado y la cantidad de horas trabajadas,
     * informar cuanto le corresponde de sueldo, restandole el 15% de sus aportes
     * 
     * 
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String datoAux;
        Integer cantidad;
        Double valorhora;
        Double total;
        Scanner misc= new Scanner(System.in);
        
        System.out.println("Horas trabajadas: ");
        datoAux= misc.next();
        cantidad= Integer.parseInt(datoAux);
        
        System.out.println("Valor de la hora trabajada: ");
        datoAux= misc.next();
        valorhora= Double.parseDouble(datoAux);
        
        total= cantidad - (valorhora - (valorhora* 0.85));
        System.out.println("El sueldo que le corresponde es : "+total);
        
     
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
