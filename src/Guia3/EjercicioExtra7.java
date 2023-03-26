/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia3;

import java.util.Scanner;

/**
 *
 * @author jorge
 */
public class EjercicioExtra7 {
    /* Realice un programa que calcule y visualice el valor máximo, el valor
mínimo y el promedio de n números (n>0). El valor de n se solicitará al
principio del programa y los números serán introducidos por el usuario.
Realice dos versiones del programa, una usando el bucle “while” y otra
con el bucle “do - while”.*/
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de números a ingresar: ");
        int cant = leer.nextInt();
        int num;
        int cont = 0;
        int suma = 0;
        int menor = 999;
        int mayor = 0;
        do {
            System.out.println("Ingrese un Número: ");
            num = leer.nextInt();
            cont++;

            suma = suma + num;
            if (num < menor) {
                menor = num;
            } else if (num > mayor) {
                mayor = num;
            }
        } while (num > 0 && cont != cant);
        System.out.println("El promedio total es: " +suma/cant);
        System.out.println("el nro menor es: " +menor);
        System.out.println("el nro mayor es: " +mayor);
    }
}
