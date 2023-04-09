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
public class Ejercicio6 {
    /*Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del
1 al 9 donde la suma de sus filas, sus columnas y sus diagonales son
idénticas. Crear un programa que permita introducir un cuadrado por
teclado y determine si este cuadrado es mágico o no. El programa
deberá comprobar que los números introducidos son correctos, es decir,
están entre el 1 y el 9.*/
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int [][] matriz = new int [3][3];
        
       llenarMatriz(matriz);
       mostrarMatriz(matriz);
       System.out.println("comparador:"+comparadorFila(matriz)); 
    }

    public static void llenarMatriz (int [][] matriz){
        Scanner leer = new Scanner(System.in);
     for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.println("Ingrese Valor para la posicion: ["+i+"] ["+j+"]");
                matriz[i][j] = leer.nextInt();
            }
        }
}
    public static void mostrarMatriz (int [][] matriz){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
            System.out.print("["+matriz[i][j]+"]");
            }
            System.out.println("");
        }
    }
    public static boolean comparadorFila(int[][] matriz) {
        boolean verificador = true;
        int sumaFila;
        int comparador = 0;
        for (int i = 0; i < 3; i++) {
            sumaFila = 0;
            for (int j = 0; j < 3; j++) {
                sumaFila += matriz[i][j];
                if (i == 0) {
                    comparador += matriz[i][j];
                }
                   if (i != 0 && i == j) {
                    if (comparador == sumaFila) {
                        verificador = true;
                    }else{
                        verificador=false;
                    }
                } 
                
                
                System.out.println("["+i+j+"]"+sumaFila);
                System.out.println(verificador);
            }
        }
        System.out.println(comparador);
        return verificador;
    }
}
