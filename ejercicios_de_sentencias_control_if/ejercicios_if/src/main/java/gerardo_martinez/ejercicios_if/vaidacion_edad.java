/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

 /*
Realiza un programa que determine y calcule 
la edad de una persona si la edad es mayor a 18 indique 
que es mayor de edad y si la edad es menor a 18 que indique 
que es menor de edad
 */
package gerardo_martinez.ejercicios_if;

import java.util.Scanner;

/**
 *
 * @author Gerry-Mel
 */
public class vaidacion_edad {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int anio_actual;// año actual de nacimiento
        int anio_nan;// año de nacimineto 
        int edad;// edad calculada 

        System.out.println("==============================");
        System.out.println("*    Calculadora de edad     *");
        System.out.println("==============================");

        System.out.println("Ingresa tu fecha de nacimiento: \n");
        anio_nan = teclado.nextInt();
        System.out.println("Ingresa el año actual: \n");
        anio_actual = teclado.nextInt();

        edad = anio_actual - anio_nan;

        if (edad >= 18) {
            System.out.println("Eres un adulto mayor\n\n");
            System.out.println("Ingresando al sistema...");
        }
        else {
            System.out.println("Eres menor ded edad no puedes acceder al sistema");
        }

    }
}
