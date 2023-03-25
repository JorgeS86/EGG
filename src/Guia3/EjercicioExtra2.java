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
public class EjercicioExtra2 {
    /* Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor
diferente a cada una. A continuación, realizar las instrucciones
necesarias para que: B tome el valor de C, C tome el valor de A, A tome
el valor de D y D tome el valor de B. Mostrar los valores iniciales y los
valores finales de cada variable. Utilizar sólo una variable auxiliar.*/
  
    public static void main(String[] args) {
        int A = 0, B = 3, C = 5, D = 6;
        System.out.println("Valores iniciales: A=" + A + ", B=" + B + ", C=" + C + ", D=" + D);
        if (A != B && B != C && C != D) {
            int aux = B;
            B = C;
            C = A;
            A = D;
            D = aux;
        } else {
            System.out.println("Los valores son iguales");
        }
        System.out.println("Valores finales: A=" + A + ", B=" + B + ", C=" + C + ", D=" + D);
    }
}  

