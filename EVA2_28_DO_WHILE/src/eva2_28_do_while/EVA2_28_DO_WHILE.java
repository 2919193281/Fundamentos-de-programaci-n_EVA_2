/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_28_do_while;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EVA2_28_DO_WHILE {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
      String user, cont;
      int num;
      num = 0;
      Scanner cap = new Scanner(System.in);
     
      do{
         System.out.println("Cual es tu nombre de usuario");
         user = cap.nextLine();
         System.out.println("Cual es tu contraseña");
         cont = cap.nextLine();
         num = num + 1;
         System.out.println(num);
         
         if(num >= 3){
             System.out.println("Demaciados intentos");
             break;
         }
         
      }
      while(!(user.equals("yo")) || !(cont.equals("1234")));
      
      
      
      System.out.println("Acceso consedido");
      // TODO code application logic here
   }
   
}
