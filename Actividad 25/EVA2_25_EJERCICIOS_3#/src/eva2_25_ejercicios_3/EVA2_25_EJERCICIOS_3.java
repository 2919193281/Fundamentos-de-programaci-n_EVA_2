/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_25_ejercicios_3;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EVA2_25_EJERCICIOS_3 {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
      
      int num, tab;
      
      Scanner cap = new Scanner(System.in);
      System.out.println("Numero de la tabla");
      num = cap.nextInt();
      
      for (int i = 1;  i <= 12; i++){
         System.out.println( i + " x " + num + " = " + (num * i));
      }
      
      // TODO code application logic here
   }
   
}
