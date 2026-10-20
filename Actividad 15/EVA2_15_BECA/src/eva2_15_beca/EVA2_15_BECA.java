/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_15_beca;

import java.util.Scanner;

/**
 *
 * @author Yisus
 */
public class EVA2_15_BECA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Creamos variables 
        int cal, salario;
        
        //Capturamos los datos del teclado 
        Scanner cap = new Scanner(System.in);
        System.out.println("Cual es tu calificasion promedio");
        cal = cap.nextInt();
        System.out.println("Cuanto ganas al mes");
        salario = cap.nextInt();
        
        //Toma de desiciones 
        if ((cal >= 80) && (salario < 10000)){System.out.println("Felicidades tienes la beca");}
        else {System.out.println("Lo sentimos no tienes beca");}
        // TODO code application logic here
    }
    
}
