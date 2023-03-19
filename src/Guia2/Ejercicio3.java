/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia2;

import java.util.Scanner;

/**
 *
 * @author jorge
 */
public class Ejercicio3 {

    public static void main(String[] args) {
/*Escribir un programa que pida una frase y la muestre toda en mayúsculas y después toda en minúsculas. */

        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresa Frase ");
        String cadena = leer.nextLine();
        System.out.println(cadena.toLowerCase());

    }
}
