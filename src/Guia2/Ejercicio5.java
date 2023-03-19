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
public class Ejercicio5 {

    public static void main(String[] args) {
        /*Escribir un programa que lea un número entero por teclado y muestre 
        por pantalla el doble, el triple y la raíz cuadrada de ese número. */
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresa un numero: ");
        int num = leer.nextInt();
        int doble = num * 2;
        int triple = num * 3;
        double raiz = Math.sqrt(num);
        System.out.println("Doble: " + doble);
        System.out.println("Triple: " + triple);
        System.out.println("Raiz Cuadrada: " + raiz);
/*prueba*/
    }
}
