/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_31_do_while_adivinar;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EVA2_31_DO_WHILE_ADIVINAR {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
      int num_tu, num_adi;
      num_adi = 2;
      Scanner cap = new Scanner(System.in);
      
      do{
         System.out.println("En que numero estoy pensando");
         num_tu = cap.nextInt();
      }
      
      while(!(num_tu == num_adi));
      System.out.println("Correcto el numero era: " + num_adi);
      
      
      // TODO code application logic here
   }
   
}
