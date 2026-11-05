/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_continue;



/**
 *
 * @author Usuario
 */
public class EVA2_CONTINUE {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
      int residuo;
      
      
      for(int i =  0; i <=20; i++){
         residuo = i % 2;
         if (residuo == 0){
            System.out.println( i + " - ");
            continue;
            
         }
      
      }
      
      
      // TODO code application logic here
   }
   
}
