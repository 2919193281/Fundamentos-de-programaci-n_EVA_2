/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_16_descuento;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EVA2_16_DESCUENTO {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
      //CREAR VARIABLES 
      String res, estu, cred, ven;
      Boolean e ;
      int edad;
      
      String v = "si";
      
      //CAPTURAR DATOS DEL TECLADO
      Scanner cap = new Scanner(System.in);
      
      System.out.println("Eres menor de edad");
      edad = cap.nextInt();
      cap.nextLine();
      
      System.out.println("Eres estudiante");
      estu = cap.nextLine();
      
      System.out.println("Tienes credencial");
      cred = cap.nextLine();
      
      System.out.println("Es ta vencida");
      ven = cap.nextLine();
      
      //TOMA DE DECISIONES
      if (edad < 18 ){
         
      }else{
         System.out.println("Lo siento pero no puedes pasar");
      
      }
      
      //RESPUESTA
      
      
      
      
      
      // TODO code application logic here
   }
   
}
