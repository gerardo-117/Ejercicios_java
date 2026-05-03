/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
 /*
realiza un programa que verifique si un numero es par o impar, pedir un numero al usurio
verificar si es par o impor he imprimir 
tu numero es par o impar
 */

package gerardo_martinez.ejercicios_if;
import java.util.Scanner;
/**
 *
 * @author Gerry-Mel
 */
public class numeros_pares {
    public static void main(String [] args){
          Scanner teclado = new Scanner(System.in);
        int numero;
        
        System.out.println("=== Verificador de numeros pares ===");
        
        System.out.println("Ingrese un numero:");
        numero = teclado.nextInt();

        System.out.println("Verificando si es par o impar...");

        if (numero % 2 == 0) {
            System.out.println("El numero es par");
        } else {
            System.out.println("tu numero es impar");
        }
    }
}
