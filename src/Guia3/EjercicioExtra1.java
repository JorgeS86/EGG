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
public class EjercicioExtra1 {
    /* Dado un tiempo en minutos, calcular su equivalente en días y horas. Por
ejemplo, si el usuario ingresa 1600 minutos, el sistema debe calcular su
equivalente: 1 día, 2 horas.*/
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese Tiempo expresado en minutos: ");
        int minutos = leer.nextInt();
        int horas = minutos / 60;
        int dias = 0;
        while (horas >= 24){
            horas = horas - 24;
            dias++;
        }
        System.out.println("Su equivalente en días es "+dias + " día/as y " +horas + " hs" );
        }
                
}
