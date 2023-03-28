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
public class Ejercicio2 {

    /*Diseñe una función que pida el nombre y la edad de N personas e
imprima los datos de las personas ingresadas por teclado e indique si
son mayores o menores de edad. Después de cada persona, el programa
debe preguntarle al usuario si quiere seguir mostrando personas y frenar
cuando el usuario ingrese la palabra “No”.*/
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la cantidad total de personas: ");
        int cant = leer.nextInt();
        edad(cant);
    }

    public static void edad(int cant) {
        Scanner leer = new Scanner(System.in);
        String opcion;

        for (int i = 0; i < cant; i++) {
            System.out.println("Ingrese el nombre de la persona: ");
            String nombre = leer.next();
            System.out.println("Ingrese la edad: ");
            int edad = leer.nextInt();

            if (edad >= 18) {
                System.out.println("Es mayor de edad");
            } else {
                System.out.println("Es menor de edad");
            }
            if (i+1 != cant ) {
                System.out.println("Desea continuar (SI/NO): ");
                opcion = leer.next();
                if (opcion.equalsIgnoreCase("NO")) {
                    break;
                }
            } else {
                System.out.println("Se finalizó con el ingreso de datos");
            }
        }
    }
}
