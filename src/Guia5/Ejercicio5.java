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
public class Ejercicio5 {

    /*   Realice un programa que compruebe si una matriz dada es antisimétrica.
Se dice que una matriz A es antisimétrica cuando ésta es igual a su
propia traspuesta, pero cambiada de signo. Es decir, A es antisimétrica si
A = -AT. La matriz traspuesta de una matriz A se denota por AT y se
obtiene cambiando sus filas por columnas (o viceversa).*/
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese tamaño de las matrices: ");
        int tamaño = leer.nextInt();

        int[][] matrizA = new int[tamaño][tamaño];
        int[][] matrizB = new int[tamaño][tamaño];

        System.out.println("");
        for (int i = 0; i < tamaño; i++) {
            for (int j = 0; j < tamaño; j++) {
                matrizA[i][j] = (int) (Math.random() * 10);
                matrizB[i][j] = -(matrizA[i][j]);
            }
        }
        System.out.println("Matriz A:");
        for (int i = 0; i < tamaño; i++) {
            for (int j = 0; j < tamaño; j++) {
                System.out.print("[" + matrizA[i][j] + "]");
            }
            System.out.println("");
        }
        System.out.println("");
        System.out.println("Matriz B:");
        for (int i = 0; i < tamaño; i++) {
            for (int j = 0; j < tamaño; j++) {
                System.out.print("[" + matrizB[i][j] + "]");
            }
            System.out.println("");
        }
        int cont = 0;
        for (int i = 0; i < tamaño; i++) {
            for (int j = 0; j < tamaño; j++) {
                if (matrizB[i][j] == -(matrizA[j][i])) {
                    cont++;
                }
            }
            if (cont == tamaño) {
                System.out.println("La matriz es antisimétrica");
            }
        }
    }
}
