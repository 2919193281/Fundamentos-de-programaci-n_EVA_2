/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_8_menu;

import java.util.Scanner;

/**
 *
 * @author bisonte
 */
public class EVA2_8_MENU {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num;
        System.out.println("Bienvenido al menu");
        Scanner cap = new Scanner(System.in);
        System.out.println(">>>>>>Menu<<<<<<");
        System.out.println("1. ventas");
        System.out.println("2. probedores");
        System.out.println("3. Empleados");
        System.out.println("4. Inventario");
        System.out.println("5. Salir");
        num = cap.nextInt();
        
        if (num == 1){System.out.println("Panrtallas de ventas");}
        else if (num == 2){System.out.println("Pantalla de pobedores");}
        else if (num == 3){System.out.println("Pantalla de empleados");}
        else if (num == 4){System.out.println("Pantalla de inventario");}
        else if (num == 5){System.out.println("Bay");}
        else{System.out.println("REspuesta invalida");}
        
       
        
        
        // TODO code application logic here
    }
    
}
