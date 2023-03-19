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
public class Ejercicio2 {
/*Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre por pantalla.*/
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresa Nombre ");
        String nombre = leer.nextLine();
        System.out.println("Tu nombre es: " + nombre);
    }
}
