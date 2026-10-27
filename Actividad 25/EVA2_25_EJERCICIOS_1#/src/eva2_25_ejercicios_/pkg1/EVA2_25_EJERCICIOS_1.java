/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_25_ejercicios_.pkg1;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EVA2_25_EJERCICIOS_1 {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
      //CREAR VARIABLES 
      int emp = 0;
      int ter = 0;
      
      //CAPTURAR DATOS DEL TECLADO
      Scanner cap = new Scanner(System.in);
      
      //IMPRIMIR Y PONER LOS DATOS EN LAS VARIABLES
      System.out.println("..........................................");
      System.out.println("primer numero incial");
      emp = cap.nextInt();
      
      System.out.println("...........................................");
      System.out.println("Segundo numero final");
      ter = cap.nextInt();
      
      //CICLO FOR
      for (int i = emp; i <= ter; i++ ){System.out.print( i + " - ");}
      
      //FINAL
      System.out.println("Cadena terminada");
         
       
      
      
      // TODO code application logic here
   }
   
}
