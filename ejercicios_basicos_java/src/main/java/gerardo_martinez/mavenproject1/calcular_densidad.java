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
public class calcular_densidad {
    public static void main(String[] args){
             /* Declaración e inicialización del objeto Scanner para leer datos desde el teclado */
        Scanner teclado = new Scanner(System.in);
        
        // declaracion de variables.
        double masa, volumen;
        double densidad;
        
        
        System.out.println("======================");
        System.out.println("+      Densidad      +");
        System.out.println("+                    +");
        System.out.println("======================\n");
        
        System.out.println("Ingresa la masa:");
        masa = teclado.nextDouble();
        
        System.out.println("ingresa el volumen:");
        volumen = teclado.nextDouble();
        
        densidad = masa/volumen;
        
        System.out.println("La densidad del cuerpo es:" + densidad);
            
        
    }
}
