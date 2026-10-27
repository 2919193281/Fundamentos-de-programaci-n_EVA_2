/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_30_menu;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EVA2_30_MENU {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
      int num;
      Scanner cap = new Scanner(System.in);
      num = 0;
      
      do{
         System.out.println("----------MENU----------");
         System.out.println("1 - Ventas");
         System.out.println("2 - Compras");
         System.out.println("3 - Provedores");
         System.out.println("4 - Clientes ");
         System.out.println("5 - Salida ");
         num = cap.nextInt();
      }
      
      while(!(num == 5 ));
      System.out.println("Salir del programa");
      // TODO code application logic here
   }
   
}
