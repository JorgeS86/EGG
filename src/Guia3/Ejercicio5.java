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
public class Ejercicio5 {
    /* Escriba un programa en el cual se ingrese un valor límite positivo, y a
continuación solicite números al usuario hasta que la suma de los
números introducidos supere el límite inicial.*/
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese Número Límite: ");
        int numlim = leer.nextInt();

        int suma = 0;
        for (int i = 0; i < numlim; i++) {
            System.out.println("Ingrese un Número: ");
            int num = leer.nextInt();
            suma = suma + num;
            if (suma > numlim) {
                break;
            }
            System.out.println("suma: " + suma);
        }
    }
}
