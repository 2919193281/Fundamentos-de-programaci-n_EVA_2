/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_14_expresiones_booleanes2;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EVA2_14_EXPRESIONES_BOOLEANES2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //CREAMOS VARIABLES 
        boolean beca, per;
        int promedio;
        String equipo;
        
        
        //CAPTURAMOS LOS DATOS DEL TECLADO
        Scanner cap = new Scanner(System.in);
        
        System.out.println("cual es tu pomedio de clificasion");
        promedio = cap.nextInt();
        cap.nextLine();
        System.out.println("Estas en un equipo representativo");
        equipo = cap.nextLine();
        
        
        //hACEMOS CALCULO
        if ((promedio >= 95) || (equipo.equals("si")) ){System.out.println("Tienes beca");}
        
        
        
        // TODO code application logic here
    }
    
}
