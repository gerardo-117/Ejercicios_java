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
public class area_del_circulo {
    public static void main(String[] args){
                //Declaración e inicialización del objeto Scanner para leer datos desde el
        //teclado
      
        Scanner teclado = new Scanner(System.in);

         
        double radio;
        double area_circulo;

        System.out.println("======================");
        System.out.println("+ Area del circulo   +");
        System.out.println("+                    +");
        System.out.println("======================\n");

        System.out.println("ingresa el Radio de tu ciruclo:");
        radio = teclado.nextDouble();

        area_circulo = Math.PI * Math.pow(radio, 2);

        System.out.println("El area de tu circulo es:" + area_circulo);
    }
}
