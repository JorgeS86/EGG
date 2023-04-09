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
public class EjercicioExtra6 {
    /*Construya un programa que lea 5 palabras de mínimo 3 y hasta 5
caracteres y, a medida que el usuario las va ingresando, construya una
“sopa de letras para niños” de tamaño de 20 x 20 caracteres. Las
palabras se ubicarán todas en orden horizontal en una fila que será
seleccionada de manera aleatoria. Una vez concluida la ubicación de las
palabras, rellene los espacios no utilizados con un número aleatorio del 0
al 9. Finalmente imprima por pantalla la sopa de letras creada.
Nota: Para resolver el ejercicio deberá investigar cómo se utilizan las
siguientes funciones de Java substring(), Length() y Math.random().*/
    public static void main(String[] args) {
        Scanner read=new Scanner(System.in);
        String palabra;
        String[][] matriz= new String[20][20];
        int f;
        completarMatriz(matriz);
        for (int i = 0; i < 5; i++) {
            do {
                System.out.println("Ingrese una palabra "+ (i+1));
                palabra=read.next().toUpperCase();
            } while (palabra.length() > 5 || palabra.length()<3);
            do  {
                f= (int) ((Math.random()*20)); 
            } while (f<0 || f >= (20));
            guardarPalabra(matriz, palabra,f);
        }
        mostrarMatriz(matriz);
    }
    public static void guardarPalabra(String matriz[][], String palabra,int f ) {
        String letra; int j;
            do  {
                j= (int) ((Math.random()*20)); 
            } while (j<0 || j >= (20 - palabra.length()));
            System.out.println(j);
                for (int l = 0; l < palabra.length(); l++) {
                    letra=palabra.substring(l, l+1); //recorro la palabra
                    matriz[f][l+j]=letra; 
                }
    }
    
    public static void completarMatriz(String matriz[][]) {
        String num;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                num=String.valueOf((int) (Math.random() * 10));
                matriz[i][j]= num;
            }
        }
    }
     public static void mostrarMatriz(String matriz[][]) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print("[ "+ matriz [i][j]+" ]");
            }
            System.out.println("");
        }
     }
}        
        
    