/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_29_do_while2;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EVA2_29_DO_WHILE2 {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
      int monto, cuenta;
      cuenta = 5000;
      
      Scanner cap = new Scanner(System.in);
      
      
      do{
         System.out.println("Cuanto vas a retirar ");
         monto = cap.nextInt();
         cuenta = cuenta - monto;
         System.out.println(cuenta+ " -- " + monto);
         
      }while(cuenta > 0);
      System.out.println("Se te acabo el dinero");
      
      
      
      
      // TODO code application logic here
   }
   
}
