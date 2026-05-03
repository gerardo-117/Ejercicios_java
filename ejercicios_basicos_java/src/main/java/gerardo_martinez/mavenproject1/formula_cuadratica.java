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
public class formula_cuadratica {
    public static void main(String[] args){
               //Declaracion de variables
        
        double coe_a; // coe es coeficiente A
        double coe_b;// coe es coeficiente B
        double coe_c;// coe es coeficiente C
        double raiz_pos, raiz_neg;// valores de los resultados;
 /* Declaración e inicialización del objeto Scanner para leer datos desde el teclado */
         Scanner teclado = new Scanner(System.in);
        
        System.out.println("======================");
        System.out.println("+ La Chicharronera   +");
        System.out.println("+                    +");
        System.out.println("======================\n");
        
        System.out.println("Ingresa el coeficiente A:");
        coe_a = teclado.nextDouble();
        
        System.out.println("Ingresa el coeficiente B:");
        coe_b = teclado.nextDouble();
        
        System.out.println("ingresa el coeficiente C:");
        coe_c = teclado.nextDouble();
        
        raiz_pos = (-coe_b +  Math.sqrt(  Math.pow( coe_b, 2) - (4 * coe_a * coe_c)   ))/( 2 * coe_a);
        raiz_neg = (-coe_b -  Math.sqrt(  Math.pow( coe_b, 2) - (4 * coe_a * coe_c)   ))/( 2 * coe_a);
        
        System.out.println("La raiz positiva es:"+raiz_pos);
        System.out.println("La raiz negativa es:"+raiz_neg);
        
    }
}
