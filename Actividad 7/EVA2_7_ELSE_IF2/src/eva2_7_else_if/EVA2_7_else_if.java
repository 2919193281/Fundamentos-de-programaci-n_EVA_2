/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_7_else_if;

import java.util.Scanner;

/**
 *
 * @author Yisus
 */
public class EVA2_7_else_if {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //CREAMOS LAS VARIABLES 
        int temp;
        
        
        //Capturamos los datos del tecaldo 
        Scanner cap = new Scanner(System.in);
        System.out.println("A que temperatura estamos");
        temp = cap.nextInt();
        
        //Toma de desiciones con rango
        if (temp >= 35){System.out.println("Muy calido");}
        else if (temp >= 20){System.out.println("Agradable");}
        else if (temp >= 10){System.out.println("Fresco");}
        else {System.out.println("Muy frio");}
        
        
        
        
        // TODO code application logic here
    }
    
}
