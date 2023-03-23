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
public class Ejercicio6 {
    /* Realizar un programa que pida dos números enteros positivos por
teclado y muestre por pantalla el siguiente menú:El usuario deberá elegir
una opción y el programa deberá mostrar el resultado por pantalla y
luego volver al menú. El programa deberá ejecutarse hasta que se elija la
opción 5. Tener en cuenta que, si el usuario selecciona la opción 5, en
vez de salir del programa directamente, se debe mostrar el siguiente
mensaje de confirmación: ¿Está seguro que desea salir del programa
(S/N)? Si el usuario selecciona el carácter ‘S’ se sale del programa, caso
contrario se vuelve a mostrar el menú.
7.*/
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese Número 1: ");
        int num1 = leer.nextInt();
        System.out.println("Ingrese Número 2: ");
        int num2 = leer.nextInt();

        String confirmacion = "";
        do {
            System.out.println("");
            System.out.println("MENU");
            System.out.println("");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            System.out.println("Elija Opción:");

            int opcion = leer.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("La Suma de " + num1 + " + " + num2 + " es de: " + (num1 + num2));
                    break;
                case 2:
                    System.out.println("La Resta de " + num1 + " - " + num2 + " es de: " + (num1 - num2));
                    break;
                case 3:
                    System.out.println("La Multiplicación de " + num1 + " x " + num2 + " es de: " + (num1 * num2));
                    break;
                case 4:
                    System.out.println("La División de " + num1 + " / " + num2 + " es de: " + (num1 / num2));
                    break;
                case 5:
                    System.out.println("¿Está seguro que desea salir del programa(S/N)?");
                    confirmacion = leer.next();
                    break;
            }
        } while (!"S".equalsIgnoreCase(confirmacion));
    }
}
