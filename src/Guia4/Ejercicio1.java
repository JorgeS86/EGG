/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia4;

import java.util.Scanner;

/**
 *
 * @author jorge
 */
public class Ejercicio1 {
    /* Crea una aplicación que le pida dos números al usuario y este pueda elegir entre sumar,restar, multiplicar y dividir. 
La aplicación debe tener una función para cada operación matemática y deben devolver sus resultados para imprimirlos 
en el main */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese 2 nros a operar: ");
        int num1 = leer.nextInt();
        int num2 = leer.nextInt();
        
        System.out.println("MENU");
        System.out.println("1: Sumar");
        System.out.println("2: Restar");
        System.out.println("3: Multiplicar");
        System.out.println("4: Dividir");
        System.out.println("");
        System.out.println("Ingrese Opción deseada: ");
        int opcion = leer.nextInt();
do {
        switch (opcion) {
            case 1:
                int suma = suma(num1, num2);
                System.out.println("La suma es: " + suma);
                break;
            case 2:
                int resta = resta(num1, num2);
                System.out.println("La resta es: " + resta);
                break;
            case 3:
                int multiplicacion = multiplicacion(num1, num2);
                System.out.println("La multiplicación es: " + multiplicacion);
                break;
            case 4:
                int division = division(num1, num2);
                System.out.println("La división es: " + division);
                break;
            default:
                System.out.println("La opción ingresada no es válida");
        }
        } while (opcion!=5);
    }

    public static int suma(int num1, int num2) {
        int sumar = num1 + num2;
        return sumar;
    }

    public static int resta(int num1, int num2) {
        int restar = num1 - num2;
        return restar;
    }

    public static int multiplicacion(int num1, int num2) {
        int multiplicar = num1 * num2;
        return multiplicar;
    }

    public static int division(int num1, int num2) {
        int dividir = num1 / num2;
        return dividir;
    }
}
