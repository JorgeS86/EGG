/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia5;

/**
 *
 * @author jorge
 */
public class Ejercicio1 {
    /*Realizar un algoritmo que llene un vector con los 100 primeros números
enteros y los muestre por pantalla en orden descendente.*/
    public static void main(String[] args) {
        int [] numeros = new int [100];
        for (int i = 0; i < numeros.length; i++) {
            numeros[i]=i;
           // System.out.println(+numeros[i]);
         }
        for (int i = numeros.length - 1; i >= 0 ; i--) {
            System.out.println(numeros[i]);   
        }
    }
}
