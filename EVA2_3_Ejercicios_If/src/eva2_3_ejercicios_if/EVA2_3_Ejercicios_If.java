/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_3_ejercicios_if;

import java.util.Scanner;

/**
 *
 * @author bisonte
 */
public class EVA2_3_Ejercicios_If {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Creamos variables y le damos los valores correspondientes
        double pre, des, res, res_des;
        int cant_pro;
        des = 10.0;
        
        //Introducion de datos
        System.out.println("Bienvenida a nuestra tienda");
        System.out.println("Cuantos productos vas a comprar");
        
        //Capturamos las valores del teclado
        Scanner cap = new Scanner(System.in);// El scanner va priero que la variable que se va a ocupar
        cant_pro = cap.nextInt();
        System.out.println("Cual es el precio del producto");
        pre = cap.nextDouble();
        //Operaciones
        res = pre * cant_pro;
        
        //Si pasa los mas de 1000 pesos se da descuento del 10%
        if (res >= 1000){
            
            System.out.println("Su total es de: " + res + "$");
            System.out.println("por su comprar de mas de 1000 le damos 10% de descuento");
            res_des = (des / 100.0 * res);
            System.out.println("Descuento de: " + "-" + res_des + "$");
            System.out.println("Su total a pagar es de: " + (res - res_des) + "$");
        }else{
            System.out.println("Su total a pagar es de: " + res + "$");
            System.out.println("si compras mas de 1000 pesos te damos un descuento del 10%");
        }
        
        
        
     
        // TODO code application logic here
    }
    
}
