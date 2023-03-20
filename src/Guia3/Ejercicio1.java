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
public class Ejercicio1 {

    /*Crear un programa que dado un número determine si es par o impar.*/
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un número");
        int num = leer.nextInt();
        if (num % 2 != 0) {
            System.out.println("El Número es Impar");
        } else {
            System.out.println("El  Número es Par");
        }
    }

}

