/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
/*
Crea un programa que calcule el area del rectangullo.
*/
package gerardo_martinez.mavenproject1;
import java.util.Scanner;

/**
 *
 * @author Gerry-Mel
 */
public class Area_del_rectangulo {

public static void main(String[] args){
    
           /* Declaración e inicialización del objeto Scanner para leer datos desde el teclado */
    Scanner teclado = new Scanner(System.in);        
        
     /*DECLARAR VARIABLES*/
   double altura,base;
   double area;      
   
        System.out.println("=======================");
        System.out.println("+ Area del Rectangulo +");
        System.out.println("+                     +");
        System.out.println("=======================\n");
        
         
        System.out.println("ingresa la altura del rectangulo:");
        altura = teclado.nextDouble();
        
        System.out.println("Ingresa la base de el rectangulo");
        base = teclado.nextDouble();
        
        area = base * altura;
        
        System.out.println("El valor del area es:" + area);
        
    
}
}
