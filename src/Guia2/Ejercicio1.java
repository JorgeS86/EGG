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
public class Ejercicio1 {

    public static void main(String[] args) {
        /*Escribir un programa que pida dos números entero por teclado y calcule la suma de los dos.
        El programa deberá después mostrar el resultado de la suma */

        int num1, num2;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresa Num 1: ");
        num1 = leer.nextInt();
        System.out.println("Ingresa Num 2: ");
        num2 = leer.nextInt();
        int suma = num1 + num2;
        System.out.println("El valor de la suma es " + suma);
    }
}
