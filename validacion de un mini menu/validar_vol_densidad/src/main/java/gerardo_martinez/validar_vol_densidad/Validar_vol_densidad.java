/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package gerardo_martinez.validar_vol_densidad;
import java.util.Scanner;
/**
 *
 * @author Gerry-Mel
 */


//Realizar un programa que solicite al usuario el valor del volumen y la masa,
//valide que el volumen sea distinto de cero y, si la condición se cumple, 
//calcule y muestre la densidad; en caso contrario, deberá mostrar un mensaje de error 
//indicando que el valor ingresado no es válido.
public class Validar_vol_densidad {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double volumen, masa, densidad;
        
        System.out.println("-- calculadora de densidad--\n");
        
        System.out.println("Ingresa el valor de el volumen:");
        volumen = teclado.nextDouble();
        System.out.println("ingresa la masa:");
        masa = teclado.nextDouble();
        
        
        if (volumen != 0){
            densidad = masa/volumen;
            System.out.println("el valor de la densidad es:"+ densidad);
        }
        else{
            System.out.println("Error:\nEl valor no puede ser 0 o menor de 0");
        }
        
        
        
        
        
    }
}
