/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_10_calificaciones;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EVA2_10_CALIFICACIONES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Crear variables 
        int cal;
        
        
        //Tomar datos del teclado y introducion 
        System.out.println("Tu calificacion");
        Scanner cap = new Scanner(System.in);
        cal = cap.nextInt();
        
        //Toma de decisiones 
        if(cal < 0){System.out.println("Datos de invalidos");}
        else if(cal > 100){System.out.println("Datos de invalidos");}
        else if(cal >= 90 ){System.out.println("Sobresaliente");}
        else if(cal >= 80 ){System.out.println("Bueno");}
        else if(cal >= 70 ){System.out.println("Aceptable");}
        else if(cal >= 0 ){System.out.println("Insuficiente");}
       
        // TODO code application logic here
    }
    
}
