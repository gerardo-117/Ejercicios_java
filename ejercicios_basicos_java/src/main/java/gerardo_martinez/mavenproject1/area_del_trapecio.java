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
public class area_del_trapecio {
    public static void main(String[] args){
                //declarar variables
        double base_menor,base_mayor;
        double altura;
        double area;
        
/* Declaración e inicialización del objeto Scanner para leer datos desde el teclado */
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("======================");
        System.out.println("+ Area del trapecio  +");
        System.out.println("+                    +");
        System.out.println("======================\n\n");
        
        System.out.print("ingresa la base mayor del trapecio:");
        base_mayor = teclado.nextDouble();
        
        System.out.println("ingresa la base menor del trapecio:");
        base_menor = teclado.nextDouble();
        
        System.out.println("Ingresa la altura del trapecio:");
        altura = teclado.nextDouble();
        
        area = ((base_mayor + base_menor)*altura)/2;
        
        System.err.println("el area del trapecio es:"+area);
    }
}
