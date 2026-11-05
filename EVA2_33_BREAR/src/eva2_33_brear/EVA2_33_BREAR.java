/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_33_brear;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EVA2_33_BREAR {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
      int num, adiv;
      adiv = 2;
      Scanner cap = new Scanner(System.in);
      
      while(true){
         System.out.println("Introduce en numero");
         num = cap.nextInt();
         
         if (num == adiv){
            System.out.println("Ganastes");
            break;
         }
         
      }
      
      
      // TODO code application logic here
   }
   
}
