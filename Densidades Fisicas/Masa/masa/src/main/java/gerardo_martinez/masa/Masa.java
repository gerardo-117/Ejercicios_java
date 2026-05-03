/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package gerardo_martinez.masa;

import java.util.Scanner;

/**
 *
 * @author Gerry-Mel
 */
// Realizar un programa que calcule el valor de masa.

public class Masa {

    public static void main(String[] args) {

        // Declaracion de las variables

        double densidad, volumen, masa;

        /*
         * Declaración e inicialización del objeto Scanner para leer datos desde el
         * teclado
         */
        Scanner teclado = new Scanner(System.in);

        System.out.println("==========================");
        System.out.println("+ Calculadora de masa    +");
        System.out.println("+                        +");
        System.out.println("========================\n");

        System.out.println("Ingresa la densidad: ");
        densidad = teclado.nextDouble();

        System.out.println("ingresa el volumen:");
        volumen = teclado.nextDouble();

        masa = densidad * volumen;

        System.out.println("El valor de la msa del cuerpo es:" + masa);

    }
}
