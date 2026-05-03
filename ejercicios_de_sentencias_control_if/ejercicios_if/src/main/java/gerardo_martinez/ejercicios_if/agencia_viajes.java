/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

 /*
realiza un programa que permita calcular el costo de un viaje a veracruz,
pedir a el usuario el numero de dias que durara el viaje, cada dia tiene un costo de $500
utiliza un if else para aplicar un descuento del 15% si el viaje dura mas de 5 dias 
 */
package gerardo_martinez.ejercicios_if;

import java.util.Scanner;

/**
 *
 * @author Gerry-Mel
 */
public class agencia_viajes {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int numero_usu;//numero de dias ingresados por el usuario.
        double promedio;//calcular dias de estancia por dia $500.
        double descuento;//aplicar desceunto del 10%
        double resta; // resta del descuento a el precio total.

        System.out.println("====================================");
        System.out.println("= Agencia de viajes hacia Veracruz =");
        System.out.println("====================================\n\n");

        System.out.println("Capture los dias de estancia: ");
        numero_usu = teclado.nextInt();

        promedio = numero_usu * 500;

        System.out.println("El costo total de tus estancia es: " + promedio);

        System.out.println("\n\nVerificando si existe alguna promocion...");

        if (numero_usu >= 5) {

            descuento = promedio * 0.10;
            System.out.println("Tu descuento es de: " + descuento);

            System.out.println("\n\nRealizando el desceunto...");

            resta = promedio - descuento;

            System.out.println("El precio total con descuento aplicado es:" + resta);

        } else {
            System.out.println("No existe ningun descuento por el momento.\n ¡Gracias por su preferencia!");

        }

    }
}
