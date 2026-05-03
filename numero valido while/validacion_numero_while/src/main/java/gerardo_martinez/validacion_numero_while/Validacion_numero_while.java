/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package gerardo_martinez.validacion_numero_while;
import java.util.Scanner;

/**
 *
 * @author Gerry-Mel
 */

// Programa que pide al usuario un número positivo.
// Mientras el número sea menor o igual a 0, seguirá pidiendo otro número.
// Cuando el usuario ingrese un número válido, muestra un mensaje de confirmación.

public class Validacion_numero_while {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero = 0;
        
        while (numero <= 0){
            System.out.println("ingresa un numero:");
            numero = teclado.nextInt();
        }
        System.out.println("!eso es, el numero es valido!");
        
    }
}
