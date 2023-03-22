/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia3;

import java.util.Scanner;

/**
 *
 * @author jorge
 */
public class EjercicioGuia9 {
    /*Escriba un programa que lea 20 números. Si el número leído es igual a cero se debe salir del bucle 
    y mostrar el mensaje "Se capturó el numero cero".  
    El programa deberá calcular y mostrar el resultado de la suma de los números leídos, 
    pero si el número es negativo no debe sumarse. Nota: recordar el uso de la sentencia break.*/
  
    public static void main(String[] args) {
        
        int cont = 0;
        int num; 
        int suma = 0;
        
        do {
            
            System.out.println("Ingrese un número");
            Scanner numero = new Scanner(System.in);
            num = numero.nextInt();
            
            if (num > 0){
               suma = suma + num;
               
            }
            cont = cont + 1;
            
        } while (cont<=20 && num!=0);
        
        System.out.println("Hemos capturando un 0 (cero)");
        System.out.println("La suma de los números anteriores es: " + suma);
    }
    
}


