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
public class EjercicioGuia10 {

    /*Realizar un programa que lea 4 números (comprendidos entre 1 y 20)
    e imprima el número ingresado seguido de tantos asteriscos como indique su valor. Por ejemplo:
    5 *****
3 ***
11 ***********
2 **    */
    public static void main(String[] args) {
        int cont = 0;
        while (cont < 4) {
            Scanner leer = new Scanner(System.in);
            System.out.println("Ingrese un nro");
            int num = leer.nextInt();
            if (num > 0 && num < 20) {
                cont = cont + 1;
                System.out.print(+num + " : ");
                for (int i = 0; i < num; i++) {
                    System.out.print("*");
                }
                System.out.println("");
            } else {

                System.out.println("Nro inválido");
            }
        }
    }
}