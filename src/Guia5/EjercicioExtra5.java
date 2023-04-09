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
public class EjercicioExtra5 {
    /*Realizar un programa que llene una matriz de tamaño NxM con valores
aleatorios y muestre la suma de sus elementos.*/
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el tamaño N de la matriz: ");
        int tamN = leer.nextInt();
        System.out.println("Ingrese el tamaño M de la matriz: ");
        int tamM = leer.nextInt();
        int suma = 0;
        
        int[][] matriz = new int[tamN][tamM];

        for (int i = 0; i < tamN; i++) {
            for (int j = 0; j < tamM; j++) {
                matriz[i][j] = (int) (Math.random() * 10);
                suma += matriz[i][j];
            }
        }
        for (int i = 0; i < tamN; i++) {
            for (int j = 0; j < tamM; j++) {
                System.out.print("[" + matriz[i][j] + "]");
            }
            System.out.println("");
        }
        System.out.println("La suma de todos los valores es: "+suma);
    }
}
