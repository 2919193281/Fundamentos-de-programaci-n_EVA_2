/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_13_expreciones_booleanas;

import java.util.Scanner;



/**
 *
 * @author Usuario
 */
public class EVA2_13_EXPRECIONES_BOOLEANAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //CREAR VARIABLES
        Boolean crede;
        String tienecredencial;
        int edad;
        
        Scanner cap = new Scanner(System.in);
        System.out.println("Cuantos años tienes");
        edad = cap.nextInt();
        cap.nextLine();
        System.out.println("Tienes credencial");
        tienecredencial = cap.nextLine();
        
        if (tienecredencial.equals("si")){crede = true;}
        else{crede = false;}
            
        //TOMA DE DECISIONES 
        if ((crede == true) && (edad >= 18) ){System.out.println("Entras");}
        else{System.out.println("No entras");}
        
        //PARTE 2
        //Creas variables
        String sol, mony;
        Boolean permiso;
        
        
        System.out.println("Hace sol");
        sol = cap.nextLine();
        System.out.println("Tienes dinero");
        mony = cap.nextLine();
        
        if ((sol.equals("si")) || (mony.equals("si"))){System.out.println("Si puedes salir");}
        else{System.out.println("No puedes salir");}
      
    }
    
}
