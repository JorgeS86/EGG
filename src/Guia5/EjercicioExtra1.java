/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia5;

import java.util.Scanner;

/**
 *
 * @author jorge
 */
public class EjercicioExtra1 {
    /*Realizar un algoritmo que calcule la suma de todos los elementos de un
vector de tamaño N, con los valores ingresados por el usuario.*/
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la dimensión del vector: ");
        int tamaño = leer.nextInt();
        leer.nextLine();
        
        int[] vector = new int[tamaño];
        int suma=0;
        
        for (int i = 0; i < vector.length; i++) {
            System.out.println("Ingrese números al vector en la posición: "+i);
            vector[i]= leer.nextInt();
            suma += vector[i];
        }
        System.out.println("La suma de todos los valores ingresados es: "+suma);
        System.out.println("");
        
        for (int i = 0; i < vector.length; i++) {
            System.out.println(+i+"["+vector[i]+"]");
        }
    }
}
