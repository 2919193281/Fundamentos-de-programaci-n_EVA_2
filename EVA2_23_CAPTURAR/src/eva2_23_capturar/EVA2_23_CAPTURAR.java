/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_23_capturar;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EVA2_23_CAPTURAR {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
      int can_cal, cali, pro, tod;
      
      cali = 0;
      
      //Solicitar las calificaciones de un grupo
      Scanner cap = new Scanner(System.in);
      System.out.println("Cuantas calificaciones quieres capturar");
      can_cal = cap.nextInt();
      cap.nextLine();
      
      for (int i = 1; i <= can_cal; i++ ){
         System.out.println("Capturar tu calificacion");
         cali = cali + cap.nextInt();
         cap.nextLine();
         
      }
      System.out.println("Acumulador;" + cali );
      System.out.println("El promedio es: " + (cali * 1.0) / can_cal);
      
      // TODO code application logic here
   }
   
}
