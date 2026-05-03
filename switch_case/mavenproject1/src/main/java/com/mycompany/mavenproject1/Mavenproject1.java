/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.mavenproject1;

import java.util.Scanner;

/**
 *
 * @author Gerry-Mel
 */
public class Mavenproject1 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int seleccion;

        System.out.println("=====MENU INICIO=====");
        System.out.println("Ingresa un valor numerico en el sistema");
        System.out.println("1)Saludar");
        System.out.println("2)Despedida");
        System.out.println("3)Salir");

        seleccion = teclado.nextInt();

        switch (seleccion) {
            case 1 ->
                System.out.println("Hola");
               
            case 2 ->
                System.out.println("Asta pronto");
                
            case 3 ->
                System.out.println("Asta pronto");
               
            default ->
                System.out.println("Opcion invalida pedazo de merenge");

        }

    }
}
