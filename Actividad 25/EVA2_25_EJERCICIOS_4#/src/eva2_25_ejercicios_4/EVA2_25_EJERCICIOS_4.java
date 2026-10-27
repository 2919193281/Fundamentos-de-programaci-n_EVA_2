/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_25_ejercicios_4;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EVA2_25_EJERCICIOS_4 {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
      
      int num, exp, total;
      total = 0;
      
      Scanner cap = new Scanner(System.in);
      System.out.println("Numero base");
      num = cap.nextInt();
      System.out.println("Numero expnente");
      exp = cap.nextInt();
      
      
      for (int i = 0; i <= exp; i++){
         total = total + (num * exp);
      }
     
      System.out.println(total);
      // TODO code application logic here
   }
   
}
