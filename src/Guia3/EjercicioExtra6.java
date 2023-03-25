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
public class EjercicioExtra6 {
    /*  Leer la altura de N personas y determinar el promedio de estaturas que
se encuentran por debajo de 1.60 mts. y el promedio de estaturas en
general. */
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de personas");
        int cantTotal = leer.nextInt();
        int altura;
        int bajos = 0;
        int promedioTotal = 0, promedioBajos = 0;
        for (int i = 0; i < cantTotal; i++) {
            System.out.println("Ingrese la altura de la persona");
            altura = leer.nextInt();
            promedioTotal += altura;
            if (altura <= 160) {
                bajos++;
                promedioBajos += altura;
            }
        }
        promedioTotal /= cantTotal;
        promedioBajos /= bajos;
        System.out.println("El promedio de altura de personas bajas es de " + promedioBajos);
        System.out.println("El promedio total de altura es de " + promedioTotal);
    }
}