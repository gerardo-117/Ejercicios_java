/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
 /*
realiza un programa que calcule el descuento del total de la compra de 5 productos,
si el total de la suma de los 5 producos es mayor a $2500 se realizara un descuento de 10%,
el programa deveria imprimir si existe descuento el total a pagar y con descuento.
 */
package gerardo_martinez.ejercicios_if;

import java.util.Scanner;

/**
 *
 * @author Gerry-Mel
 */
public class compras_productos {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        double descuento, prod_1, prod_2, prod_3, prod_4, prod_5, suma, total_des;

        System.out.println("=== Verificador de descuentos ===");

        System.out.println("ingresa el valor de tu primer articulo:");
        prod_1 = teclado.nextDouble();
        System.out.println("ingresa el valor de tu segundo articulo:");
        prod_2 = teclado.nextDouble();
        System.out.println("ingresa el valor de tu tercer articulo:");
        prod_3 = teclado.nextDouble();
        System.out.println("ingresa el valor de tu cuarto articulo:");
        prod_4 = teclado.nextDouble();
        System.out.println("ingresa el valor de tu quinto articulo:");
        prod_5 = teclado.nextDouble();

        suma = prod_1 + prod_2 + prod_3 + prod_4 + prod_5;

        System.out.println("EL precio en total es:" + suma);

        System.out.println("verificando si tiene un descuento...");

        if (suma >= 2500) {
            descuento = suma * 0.10;
            total_des = suma - descuento;
            System.out.println("La suma total de tus productos es\n" + suma);
            System.out.println("el valor de tu descuento es:" + descuento);
            System.out.println("tus productos con descuentos es:" + total_des);

        } else {
            System.out.println("tus productos no tiene un descuento,\n\n total a pagar es:" + suma);
        }

    }

}
