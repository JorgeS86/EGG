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
public class Ejercicio3 {
     public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresa la cantidad de euros a convertir");
        double euro = leer.nextInt();
        System.out.println("Ingresa el tipo de moneda a realizar el cambio");
        String moneda = leer.next();
        
        conversion(euro,moneda);
        
        
    }
    
    public static void conversion(double euro, String moneda){
        moneda = moneda.toLowerCase();
        switch (moneda) {
            case "libra":
                System.out.println(+ euro + " Euros es igual a " + (euro*0.86) + " libra");
                break;
            case "dolar":
                System.out.println(+ euro + " Euros es igual a " + (euro*1.28611) + " dolares");
                break;
            case "yenes":
                System.out.println(+ euro +" Euros es igual a " + (euro*129.852) + " yenes");
                break;
            default:
                System.out.println("La opcion ingresada no es valida");
        }
    }
    
}

