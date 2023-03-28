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
public class EjercicioGuia12 {
    /*Crea un procedimiento EsMultiplo que reciba los dos números pasados por el usuario,
validando que el primer número múltiplo del segundo e imprima si el primer número es múltiplo del segundo,
sino informe que no lo son.*/
    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese Primer Número: ");
        int num1 = leer.nextInt();
        System.out.println("Ingrese Segundo Número: ");
        int num2 = leer.nextInt();
        multiplo(num1, num2);
    }

    public static void multiplo(int num1, int num2) {
        if (num1 % num2 == 0) {
            System.out.println(+num1 + " Es múltiplo de " + num2);
        } else {
            System.out.println(+num1 + " No es Múltiplo de " + num2);
        }
    }
}
