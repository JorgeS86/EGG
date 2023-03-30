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
public class Ejercicio2 {
    /*Realizar un algoritmo que llene un vector de tamaño N con valores aleatorios
y le pida al usuario un número a buscar en el vector. El programa mostrará dónde se encuentra el numero
y si se encuentra repetido*/
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del vector: ");
        int tamaño = leer.nextInt();

        int[] numeros = new int[tamaño];
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (int) (Math.random() * 10);
            System.out.println("["+i+"]"+numeros[i]);
        }
        System.out.println("Ingrese Número a encontrar: ");
        int num = leer.nextInt();
        boolean verif = false;
        int cont=0;
        
        for (int i = 0; i < numeros.length; i++) {
            if (num==numeros[i]) {
                verif = true;
                cont++;
                System.out.println("El nro buscado se encuentra en la posición: " +i);
            }
        }
        
        if (verif!=true) {
           System.out.print("El nro buscado no se encuentra en el vector");
        }else{
            System.out.println("El nro se repite :"+cont +" veces");
        }
        System.out.println("");
    }

}
