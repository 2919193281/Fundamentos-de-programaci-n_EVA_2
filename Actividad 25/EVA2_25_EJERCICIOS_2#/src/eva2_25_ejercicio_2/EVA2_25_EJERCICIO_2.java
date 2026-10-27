/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_25_ejercicio_2;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EVA2_25_EJERCICIO_2 {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
      //CREAMOS VARIABLES
      String acu;
      int num;
      
      //LES DAMOS VALORES
      num = 0;
      acu = ""; 
     
      //CAPTURAR DATOS DEL TECLADO
      Scanner cap = new Scanner(System.in);
      System.out.println("--------");
      System.out.println("Numero: ");
      num = cap.nextInt();
      System.out.println("--------");
      
      //CICLO FOR 
      for (int i = 0; i <= num; i ++){
         //acomulador de texto
         acu = acu + "*";
         System.out.println(acu);
      }
      //FINAL
      System.out.println("------------------");
      System.out.println("Cadenas terminadas");
      
      
      // TODO code application logic here
   }
   
}
