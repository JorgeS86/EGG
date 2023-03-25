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
public class EjercicioExtra5 {
    /* Una obra social tiene tres clases de socios:
○ Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de
descuento en todos los tipos de tratamientos.
○ Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de
descuento para los mismos tratamientos que los socios del tipo A.
○ Los socios que menos aportan, los de tipo ‘C’, no reciben
descuentos sobre dichos tratamientos.
○ Solicite una letra (carácter) que representa la clase de un socio, y
luego un valor real que represente el costo del tratamiento (previo
al descuento) y determine el importe en efectivo a pagar por dicho
socio.*/
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese Clase de Socio: ");
        String clase = leer.nextLine();
        clase = clase.toUpperCase();
        System.out.println("Ingrese costo del tratamiento: ");
        int costo = leer.nextInt();
        switch (clase) {
            case "A":
                System.out.println("El costo del tratamiento es: $" + costo);
                System.out.println("El valor a abonar con el 50% de descuento es: $" + (costo - (costo * 50) / 100));
                break;
            case "B":
                System.out.println("El costo del tratamiento es: $" + costo);
                System.out.println("El valor a abonar con el 35% de descuento es: $" + (costo - (costo * 35) / 100));
                break;
            case "C":
                System.out.println("El costo del tratamiento es: $" + costo);
                System.out.println("El valor a abonar (no aplica descuento): $" + costo);
                break;
            default:
                throw new AssertionError();
        }
    }
}

