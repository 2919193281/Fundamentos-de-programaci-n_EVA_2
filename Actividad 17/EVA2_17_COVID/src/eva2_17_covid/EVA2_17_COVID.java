/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_17_covid;

import java.util.Scanner;

/**
 *
 * @author Yisus
 */
public class EVA2_17_COVID {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int edad;
        Double peso, esta, IMC;
        String enfe;
        
        Scanner cap = new Scanner(System.in);
        System.out.println("Cuantos años tienes");
        edad = cap.nextInt();
        System.out.println("Cual es tu peso");
        peso = cap.nextDouble();
        System.out.println("Cual es tu estatura");
        esta = cap.nextDouble();
        System.out.println("Cuentas con una enfermedad cronica");
        cap.nextLine();
        enfe = cap.nextLine();
        
        IMC = peso / (esta * esta);
        
        if ((edad > 65) || (enfe.equals("si") || (IMC >= 25) ) ){System.out.println("Tienes riesgo a tener covid");}
        else{System.out.println("No tienes riesgo a tener covid");}
        
       System.out.println("");
       System.out.println("Edad: " + edad);
       System.out.println("Peso en Kg: " + peso + "Kg");
       System.out.println("Estatura en m: " + esta + "m");
       System.out.println("Con enfermedad cronica: " + enfe );
       System.out.println("Indice de masa corporal: " + IMC);
       System.out.println("Si es mayor que 25 es sobrepeso");
        
        
        // TODO code application logic here
    }
    
}
