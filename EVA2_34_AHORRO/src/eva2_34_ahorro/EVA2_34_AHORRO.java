/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_34_ahorro;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EVA2_34_AHORRO {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
      int ahorro, deposito, cuenta;
      ahorro = 15000;
      deposito = 0;
      cuenta = 0;
      
      
      Scanner cap = new Scanner(System.in);
      
      while(true){
         System.out.println("Introduce el deposito");
         deposito = cap.nextInt();
         //VERIFICAR SI NO NOS ESTAMOS PASANDO
         cap.nextLine();
         
         System.out.println("cuenta" + cuenta);
         if((cuenta + deposito) > ahorro ){
            System.out.println("Te pasastes de la meta");
            continue;
         }cuenta += deposito;
         if (cuenta == ahorro){
            System.out.println("Se cumplio con la meta");
            break;
         }
         
         
      }
      
      
      
      
      
      
      // TODO code application logic here
   }
   
}
