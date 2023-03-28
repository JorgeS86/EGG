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
public class EjercicioGuia11 {
    /* Escribir un programa que procese una secuencia de caracteres ingresada por teclado y terminada en punto,
    y luego codifique la palabra o frase ingresada de la siguiente manera: 
    cada vocal se reemplaza por el carácter que se indica en la tabla y el resto de los caracteres 
    (incluyendo a las vocales acentuadas) se mantienen sin cambios.
    
    Realice un subprograma que reciba una secuencia de caracteres y retorne la codificación correspondiente. 
    Utilice la estructura “según” para la transformación. 
Por ejemplo, si el usuario ingresa:     Ayer, lunes, salimos a las once y 10.
La salida del programa debería ser:  @y#r, l*n#s, s@l$m%s @ l@s %nc# y 10. */
    
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una palabra/frase: ");
        salida(leer.nextLine());
    }       
    public static void salida(String frase) {
        String fraseaux = "";
        for (int i = 0; i < frase.length(); i++) {
            switch (frase.substring(i, i + 1)) {
                case "A":
                case "Á":
                case "a":
                case "á":
                    fraseaux += "@";
                    break;
                case "E":
                case "É":
                case "e":
                case "é":
                    fraseaux += "#";
                    break;
                case "I":
                case "Í":
                case "i":
                case "í":
                    fraseaux += "$";
                    break;
                case "O":
                case "Ó":
                case "o":
                case "ó":
                    fraseaux += "%";
                    break;
                case "U":
                case "Ú":
                case "u":
                case "ú":
                    fraseaux += "*";
                    break;
                default:
                    fraseaux += frase.substring(i, i + 1);
                }
                }
          System.out.println("Frase cambiada: "+fraseaux); 
        }

}
/* EJERCICIO OK
   public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una palabra/frase: ");
        String frase = (leer.nextLine());
        salida(frase);
        
    }       
    public static String salida(String frase) {
       String fraseaux = "";
        for (int i = 0; i < frase.length(); i++) {
            switch (frase.substring(i, i + 1)) {
                case "A":
                case "Á":
                case "a":
                case "á":
                    fraseaux += "@";
                    break;
                case "E":
                case "É":
                case "e":
                case "é":
                    fraseaux += "#";
                    break;
                case "I":
                case "Í":
                case "i":
                case "í":
                    fraseaux += "$";
                    break;
                case "O":
                case "Ó":
                case "o":
                case "ó":
                    fraseaux += "%";
                    break;
                case "U":
                case "Ú":
                case "u":
                case "ú":
                    fraseaux += "*";
                    break;
                default:
                    fraseaux += frase.substring(i, i + 1);
            }
        }
        System.out.println("Frase cambiada: " + fraseaux);
return fraseaux;
    }
}*/