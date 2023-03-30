/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia5;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author jorge
 */
public class Ejercicio3 {

    /*Recorrer un vector de N enteros contabilizando cuántos números son de
1 dígito, cuántos de 2 dígitos, etcétera (hasta 5 dígitos).*/
    public static void main(String[] args) {
        Random random = new Random();
        Scanner leer = new Scanner(System.in); 
        System.out.println("Ingrese el tamaño del vector: ");
        int tamaño = leer.nextInt();

        int[] numeros = new int[tamaño];
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = random.nextInt(10000);
            System.out.println("[" + i + "]" + numeros[i]);
        }
        String convNumPal;
        int unoD = 0;
        int dosD = 0;
        int tresD = 0;
        int cuatroD = 0;
        int cincoD = 0;

        for (int i = 0; i < numeros.length; i++) {
            convNumPal = String.valueOf(numeros[i]);
            switch (convNumPal.length()) {
                case 1:
                    unoD++;
                    break;
                case 2:
                    dosD++;
                    break;
                case 3:
                    tresD++;
                    break;
                case 4:
                    cuatroD++;
                    break;
                case 5:
                    cincoD++;
                    break;
            }
        }
        System.out.println("");
        System.out.println("Con un Dígito: "+unoD);
        System.out.println("Con dos Dígitos: "+dosD);
        System.out.println("Con tres Dígitos: "+tresD);
        System.out.println("Con cuatro Dígitos: "+cuatroD);
        System.out.println("Con cinco Dígitos: "+cincoD);
    }
}
