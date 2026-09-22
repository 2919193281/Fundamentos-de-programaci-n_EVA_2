/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_2_calificaciones;

import java.util.Scanner;

/**
 *
 * @author bisonte
 */
public class EVA2_2_Calificaciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Crear variables
        double cal;
        //Capturara datos de la teclado 
        System.out.println("Que calificacion sacastes en este semestre (100 - 0)");
        Scanner cap = new Scanner(System.in);
        //Guardar el dato en la variable
        cal = cap.nextDouble();
        
        //Ver si aprobastes o no
        if (cal >= 70){
            System.out.println("Felicidades pasastes");
        }else {
            System.out.println("Lo siento pero reprobastes");
        }
        
        
        // TODO code application logic here
    }
    
}
