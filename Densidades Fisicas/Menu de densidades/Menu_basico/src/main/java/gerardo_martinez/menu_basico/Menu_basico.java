/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package gerardo_martinez.menu_basico;

import java.util.Scanner;

/**
 *
 * @author Gerry-Mel
 */
// Relaizar un mini menu que calcule las 3 densidadedes,
// densidad, masa, volumen.

public class Menu_basico {

    public static void masa(Scanner teclado) {

        int opcion;
        double densidad, volumen, masa;

        do {
            System.out.println("==========================");
            System.out.println("+ Calculadora de masa    +");
            System.out.println("+                        +");
            System.out.println("==========================");
            System.out.println("1) Calcular masa");
            System.out.println("0) Regresar al menú principal");
            System.out.print("Elige una opción: ");
            opcion = teclado.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingresa la densidad: ");
                    densidad = teclado.nextDouble();

                    System.out.print("Ingresa el volumen: ");
                    volumen = teclado.nextDouble();

                    masa = densidad * volumen;
                    System.out.println("La masa del cuerpo es: " + masa);
                    break;

                case 0:
                    System.out.println("Regresando al menú principal...");
                    break;

                default:
                    System.out.println("Opción inválida, intenta de nuevo");
            }

        } while (opcion != 0);
    }

    public static void densidad(Scanner teclado) {

        int opcion;
        double masa, volumen, densidad;

        do {
            System.out.println("======================");
            System.out.println("+     Densidad       +");
            System.out.println("+                    +");
            System.out.println("======================");
            System.out.println("1) Calcular densidad");
            System.out.println("0) Regresar al menú principal");
            System.out.print("Elige una opción: ");
            opcion = teclado.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingresa la masa: ");
                    masa = teclado.nextDouble();

                    System.out.print("Ingresa el volumen: ");
                    volumen = teclado.nextDouble();

                    if (volumen != 0) {
                        densidad = masa / volumen;
                        System.out.println("La densidad del cuerpo es: " + densidad);
                    } else {
                        System.out.println("Error: el volumen no puede ser 0");
                    }
                    break;

                case 0:
                    System.out.println("Regresando al menú principal...");
                    break;

                default:
                    System.out.println("Opción inválida, intenta de nuevo");
            }

        } while (opcion != 0);
    }

    public static void volumen(Scanner teclado) {

        int opcion;
        double masa, densidad, volumen;

        do {
            System.out.println("===========================");
            System.out.println("+ Calculadora de volumen  +");
            System.out.println("+                         +");
            System.out.println("===========================");
            System.out.println("1) Calcular volumen");
            System.out.println("0) Regresar al menú principal");
            System.out.print("Elige una opción: ");
            opcion = teclado.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingresa la masa: ");
                    masa = teclado.nextDouble();

                    System.out.print("Ingresa la densidad: ");
                    densidad = teclado.nextDouble();

                    if (densidad != 0) {
                        volumen = masa / densidad;
                        System.out.println("El volumen del cuerpo es: " + volumen);
                    } else {
                        System.out.println("Error: la densidad no puede ser 0");
                    }
                    break;

                case 0:
                    System.out.println("Regresando al menú principal...");
                    break;

                default:
                    System.out.println("Opción inválida, intenta de nuevo");
            }

        } while (opcion != 0);
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int valor_men;

        do {

            System.out.println("===============================");
            System.out.println("+                             +");
            System.out.println("+     Menu de densidades      +");
            System.out.println("+                             +");
            System.out.println("===============================\n\n");
            System.out.println("Elige una opción que quieras calcular:\n\n");
            System.out.println("1) Calcular la masa de un cuerpo");
            System.out.println("2) Calcular la densidad de un cuerpo");
            System.out.println("3) Calcular el volumen de un cuerpo");
            System.out.println("0) Salir");
            System.out.print("Ingresa la opción para calcular: ");
            valor_men = teclado.nextInt();

            switch (valor_men) {
                case 1:
                    masa(teclado);
                    break;
                case 2:
                    densidad(teclado);
                    break;
                case 3:
                    volumen(teclado);
                    break;
                case 0:
                    System.out.println("Saliendo del sistema...");
                    break;
                default:
                    System.out.println("Opción inválida mi compa");
            }
        } while (valor_men != 0);

        teclado.close();
    }

}
