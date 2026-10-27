/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_27_califas;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EVA2_27_CALIFAS {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
      
      Scanner cap = new Scanner(System.in);
      
      int cali = 0;
      double pro = 0;0
      int total = 0;
      int can = 0;
      
      
      while (cali >= 0){
         System.out.println("Introdusca -1 para termina");
         cali = cap.nextInt();
         can = can + 1; 
         pro = pro + cali;
      }
      
      total = ((pro * 1.0) / can) ;
      System.out.println(total);
      
      
      
      
      
      
      
      
      
      
      
      // TODO code application logic here
   }
   
}
