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
public class EjercicioExtra2 {
    /*Escriba un programa que averigüe si dos vectores de N enteros son
iguales (la comparación deberá detenerse en cuanto se detecte alguna
diferencia entre los elementos).*/
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la dimensión de los vectores: ");
        int tamaño = leer.nextInt();
        leer.nextLine();
        
        int[] vector1 = new int[tamaño];
        int[] vector2 = new int[tamaño];
        
        for (int i = 0; i < vector1.length; i++) {
            System.out.println("Ingrese números al vector 1 en la posición: "+i);
            vector1[i]= leer.nextInt();
        }
        System.out.println("");
        for (int i = 0; i < vector2.length; i++) {
            System.out.println("Ingrese números al vector 2 en la posición: "+i);
            vector2[i]= leer.nextInt();
        }
        System.out.println("");
        System.out.println("VECTOR 1:");
        for (int i = 0; i < vector1.length; i++) {
            System.out.println(+i+"["+vector1[i]+"]");
        }
        System.out.println("");
        System.out.println("VECTOR 2:");
        for (int i = 0; i < vector2.length; i++) {
            System.out.println(+i+"["+vector2[i]+"]");
        }
        int contador=0;
        for (int i = 0; i < tamaño; i++) {
            if (vector1[i]==vector2[i]) {
                contador++;
            }else{
                break;
            }
        }
        System.out.println("");
        if (contador==tamaño) {
            System.out.println("Los vectores son iguales");
        }else{
            System.out.println("Los vectores no son iguales");
        }
    }
}
