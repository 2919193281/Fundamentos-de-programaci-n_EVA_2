/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_11_acceso;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EVA2_11_ACCESO {
   

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        final String USER = "yo";
        final int CONTRA = 12345;
        
        //CREAMOS VARIABLES
        String tu_user;
        int tu_con;
        
        //CAPTURAR VALORES DEL TECLADO
        Scanner cap = new Scanner(System.in);
        System.out.println("Cual es tu nombre de usuario: ");
        tu_user = cap.nextLine();
        System.out.println("contraseña: ");
        tu_con = cap.nextInt();
        
        
        if (tu_user.equals(USER) && (tu_con == CONTRA)){System.out.println("Acceso permitido");}
        else{System.out.println("Error, Acceso denegado");}
        
        
        // tien que darta acceso si las contraseña y el usuario estan bien
    }
    
}
