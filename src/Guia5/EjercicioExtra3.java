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
public class EjercicioExtra3 {
    /*Crear una función rellene un vector con números aleatorios, pasándole
un arreglo por parámetro. Después haremos otra función o
procedimiento que imprima el vector.*/
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del vector: ");
        int tamaño = leer.nextInt();
        
        int [] vector = new int[tamaño];
        
        rellenarVector(vector);
        imprimirVector(vector);
        
    }
    public static int [] rellenarVector(int vector[]){
        for (int i = 0; i < vector.length; i++) {
            vector[i] = (int) (Math.random() * 10);
        }
        return vector;
    }
    public static int [] imprimirVector(int vector[]){
        for (int i = 0; i < vector.length; i++) {
            System.out.println("["+vector[i]+"]");
        }
        return vector;
    }
}
