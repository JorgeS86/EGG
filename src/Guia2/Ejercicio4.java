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
public class Ejercicio4 {

    public static void main(String[] args) {
        /*Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados Fahrenheit. 
        La fórmula correspondiente es: F = 32 + (9 * C / 5).*/
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresa grados (C°): ");
        int cent = leer.nextInt();
        int far = 32 + (9 * cent / 5);
        System.out.println("Farenheit: " + far);
    }
}
