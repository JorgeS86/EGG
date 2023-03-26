/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia3;

/**
 *
 * @author jorge
 */
public class EjercicioExtra8 {
    /*Escriba un programa que lea números enteros. Si el número es múltiplo
de cinco debe detener la lectura y mostrar la cantidad de números
leídos, la cantidad de números pares y la cantidad de números impares.
Al igual que en el ejercicio anterior los números negativos no deben
sumarse. Nota: recordar el uso de la sentencia break.*/
      public static void main(String[] args) {
        java.util.Scanner leer = new java.util.Scanner(System.in);
        int num;
        int contPar=0;
        int contImpar=0;
        int cont=0;
        
          do {
              System.out.println("Ingrese Número: ");
              num = leer.nextInt();
              if (num>0 && num%2==0) {
                  contPar++;
              }else{
                  contImpar++;
              }
              cont++;
          } while (!(num%5==0));
         
        System.out.println("Se leyeron " +cont + " números");
        System.out.println("Se leyeron " +contPar + " números pares");
        System.out.println("Se leyeron " +contImpar + " números impares");
    }
}

