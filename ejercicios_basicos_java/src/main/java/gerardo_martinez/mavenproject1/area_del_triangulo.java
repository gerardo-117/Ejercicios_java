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
public class area_del_triangulo {
    public static void main(String[] args){
         //declarar variables 
        /* Declaración e inicialización del objeto Scanner para leer datos desde el teclado */
        Scanner teclado = new Scanner(System.in);      double base, altura;
        double resultado;
        
        System.out.println("======================");
        System.out.println("+ Area del triangulo +");
        System.out.println("+                    +");
        System.out.println("======================\n");



        //pedir los datos al usuario 
        System.out.println("ingresa la altura de tu tonto triangulo:");
        altura = teclado.nextDouble();

        System.out.println("Ingresa la base de tu triangulo:");
        base = teclado.nextDouble();

        resultado = (base * altura) / 2;

        System.out.println("el area de tu tonto triangulo es:" + resultado);
    }
    
}
