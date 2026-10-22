/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_24_factorial;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EVA2_24_FACTORIAL {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
      
      int num, facto;
      facto = 1;
         
      Scanner cap = new Scanner(System.in);
      System.out.println("Valor a calcular: ");
      num = cap.nextInt();
      
      for (int i = num; i <= 5; i++){
         System.out.print( i + " x " );
         facto = facto * i;
      }
      System.out.println("");
      System.out.println(facto);
      System.out.println(facto);
      
      
      // TODO code application logic here
   }
   
}
