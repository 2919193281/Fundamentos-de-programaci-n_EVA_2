/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_5_if;

import java.util.Scanner;

/**
 *
 * @author bisonte
 */
public class EVA2_5_IF {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Creamos variables
        int edad, credencial;
        
        Scanner cap = new Scanner(System.in);
        
        System.out.println("Cuantos años tienes: ");
        edad = cap.nextInt();
        
        if (edad >= 18){
            System.out.println("Tienes credencial del lector: " + "Si (1) no (0) ");
            credencial = cap.nextInt();
            if (credencial == 1){
                System.out.println("Puedes pasar");
            }else{
                System.out.println("No puedes pasar:");
            }
            
        }else{
            System.out.println("No puedes pasar: ");
        }
        
        
        
        // TODO code application logic here
    }
    
}
