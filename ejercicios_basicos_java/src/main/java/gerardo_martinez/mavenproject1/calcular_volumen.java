/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gerardo_martinez.mavenproject1;
import java.util.Scanner;
/**
 *
 * @author Gerry-Mel
 */
public class calcular_volumen {
    public static void main(String[] args){
                double masa,densidad,volumen;
        
        
/* Declaración e inicialización del objeto Scanner para leer datos desde el teclado */
        Scanner teclado = new Scanner(System.in);

        System.out.println("===========================");
        System.out.println("+ caluladora del volumen  +");
        System.out.println("+                         +");
        System.out.println("==========================\n");  
        
        System.out.println("Ingresa la masa:");
        masa = teclado.nextDouble();
        
        System.out.println("ingresa el valor de la densidad:");
        densidad = teclado.nextDouble();
        
        volumen = masa/densidad;
        
        System.out.println("El valor de la densidad es:"+ volumen);
    }
}
