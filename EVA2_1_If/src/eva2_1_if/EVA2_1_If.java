/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_1_if;

import java.util.Scanner;

/**
 *
 * @author bisonte
 */
public class EVA2_1_If {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Crear las variables 
        int edad;
        //Capturar datos del teclado
        System.out.println("Cual es tu edad");
        Scanner cap = new Scanner(System.in);
        //dar valor a la variable 
        edad = cap.nextInt();
        
        //Toma de desiciones 
        if (edad >= 18) { //Si solo es un dato no es necesario poner las llaves
        System.out.println("Puedes pasar");
        //El verdadero (if) es obligatoria y el falso (else) no lo es 
        } else {
        System.out.println("No cuentas con la edad suficiente para pasar");
        }
        //Las llaves hace que pertenezca a todo el codigo que esta adentro de estas 
        
        // TODO code application logic here
    }
    
}
