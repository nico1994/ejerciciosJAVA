/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto3;

import com.sun.javafx.scene.traversal.Direction;
import java.time.temporal.TemporalAdjusters;
import java.util.Scanner;

/**
 *
 * @author Sofia
 */
public class Proyecto3 {

    /**
     * @param args the command line arguments
     * Se debe pedir el nombre y el apellido, luego mostrarlo en el siguiente mensaje 
     * Su nombre es xxx y xxx es su apellido
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nombre;
        String apellido;
        Scanner misc= new Scanner (System.in);
        System.out.println("Cual es su nombre?  ");
        nombre= misc.nextLine();
        System.out.println("Cual es su apellido? ");
        apellido= misc.nextLine();
        System.out.println("Su nombre es "+nombre+" y su apellido es "+apellido );
        
       
       
    }
    
}
