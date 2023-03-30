/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia5;

import java.util.Scanner;

/**
 *
 * @author jorge
 */
public class EjercicioGuia13 {
    /*Crea un vector llamado ‘Equipo’ cuya dimensión sea la cantidad de compañeros
de equipo y define su tipo de dato de tal manera que te permita alojar sus
nombres más adelante.*/
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de compañeros de equipo: ");
        int cant = leer.nextInt();
        leer.nextLine();
        String[] Equipo = new String[cant];
        
        for (int i = 0; i < Equipo.length; i++) {
            System.out.println("Ingrese Nombre: ");
            Equipo[i] = leer.nextLine();
           // System.out.println("Los nombres Ingresados son: " +Equipo[i] );
        }

        System.out.println("Los nombres Ingresados son: ");
        
        for (int i = 0; i < Equipo.length; i++) {
            System.out.println("["+i +" : "+ Equipo[i] + "]");
            
        }
    }
}
