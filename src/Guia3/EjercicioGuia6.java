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
public class EjercicioGuia6 {

    public static void main(String[] args) {
        /* Implementar un programa que le pida dos números enteros al usuario y determine si ambos o alguno de ellos es mayor a 25  */
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese dos números");
        int num1 = leer.nextInt();
        int num2 = leer.nextInt();
        if (num1 > 25 && num2 > 25) {
            System.out.println("Los dos números ingresados son mayores a 25");
        } else if (num1 > 25) {
            System.out.println("El primer nro ingresado es mayor a 25");
        } else if (num2 > 25) {
            System.out.println("El segundo nro ingresado es mayor a 25");
        } else {
            System.out.println("Ambos nros son menores de 25");

        }
    }
}
