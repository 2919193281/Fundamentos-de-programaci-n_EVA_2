/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_9_estacionamento;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EVA2_9_ESTACIONAMENTO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Crear variables
        int hor, tot, cos;
        cos = 0;
        
        
        //Capturar los datos del teclado y la introducion 
        System.out.println("Bienvenido, por favor cuantas horas lleva su coche");
        Scanner cap = new Scanner(System.in);
        hor = cap.nextInt();
        
        //Toma de decisiones 
        if (hor > 10){cos = 150;}
        else if (hor > 5){ cos = 10;}
        else if (hor > 2){ cos = 20;}
        else if (hor > 0){ cos = 25;}
        
        //Calculo 
        tot = (hor * cos);
        System.out.println("Por: " + hor + " horas");
        System.out.println("Se le cobra: " + cos + "$" + " por la hora ");
        System.out.println("Dando un total de: " + tot + "$");
        
       
        
        
        // TODO code application logic here
    }
    
}
