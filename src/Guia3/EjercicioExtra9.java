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
public class EjercicioExtra9 {
    /*Simular la división usando solamente restas. Dados dos números enteros
mayores que uno, realizar un algoritmo que calcule el cociente y el
residuo usando sólo restas. Método: Restar el dividendo del divisor hasta
obtener un resultado menor que el divisor, este resultado es el residuo, y
el número de restas realizadas es el cociente.
Por ejemplo: 50 / 13:
50 – 13 = 37 una resta realizada
37 – 13 = 24 dos restas realizadas
24 – 13 = 11 tres restas realizadas
dado que 11 es menor que 13, entonces: el residuo es 11 y el cociente es
3.
¿Aún no lo entendiste? Recomendamos googlear división con restas
sucesivas.*/
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num1, num2;
        do {
            System.out.println("Ingresa 2 Números mayores a 1: ");
            num1 = leer.nextInt();
            num2 = leer.nextInt();
        } while (num1 < 1 || num2 < 1);
        int cociente = 0;
        while (num1 > num2) {
            num1 -= num2;
            cociente++;
        }
        System.out.println("Dado que " + num1 + " es menor que " + num2 + " entonces el residuo es " + num1 + " y el cociente es " + cociente);
    }
}
