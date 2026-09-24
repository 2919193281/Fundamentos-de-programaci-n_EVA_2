/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_4_ejercicio_if2;

import java.util.Scanner;

/**
 *
 * @author bisonte
 */
public class EVA2_4_Ejercicio_if2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Crear variables 
        double sal, bono;
        String nom;
        
        //Capturamos valores del teclado y damos introducion
        Scanner cap = new Scanner(System.in);
        System.out.println("Introdusca tu nombre: ");
        nom = cap.next();
        System.out.println("Cuanto ganas al mes: ");
        sal = cap.nextDouble();
        
        
        if (sal < 12000){
            bono = ((10 / 100.0) * sal);   
        }else{
            bono = ((5 / 100.0) * sal);
        }
        
        System.out.println("Nombre: " + nom);
        System.out.println("Salario: " + sal +"$");
        System.out.println("bono: " + bono + "$" );
        System.out.println("Salario total: " + (sal + bono) + "$");
        
        
        // TODO code application logic here
    }
    
}
