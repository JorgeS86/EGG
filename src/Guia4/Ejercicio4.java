/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia4;

import java.util.Scanner;

/**
 *
 * @author jorge
 */
public class Ejercicio4 {
    public static void main(String[] args) {
        
    Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el numero para saber si es primo");
        int num = leer.nextInt();
        primo(num);
        //int i = 2;
        }
   public static void primo(int num){
       boolean prim = true;
       int i = 0;
       for(i=2;i < num; i++){
           if (num % i == 0){
            prim = false;
              
           }
        
       }
       if ( prim ){
            System.out.println(" el numero es primo");
       } else{
            System.out.println(">El numero no es primo");
       }
   }
}
