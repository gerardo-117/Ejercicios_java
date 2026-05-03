/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package gerardo_martinez.acceso_con_edad;
import java.util.Scanner;
/**
 *
 * @author Gerry-Mel
 */

//Realizar un programa que mande un mensaje al usuario mediante el ingreso de su edad.
public class Acceso_con_edad {

    public static void main(String[] args) {
        int edad;
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("---Acceso a tu Banco Digital--\n\n");
        System.out.println("Bienvenido de nuevo\n\n");
        System.out.println("El sistema donde puedes consultar movimientos bancarios y transacciones");
        System.out.println("Este sistema solo es para mayores de edad\n\n");
        
        System.out.println("Ingresa tu edad para acceder:");
        edad = teclado.nextInt();
        
        if (edad >= 18){
            System.out.println("Ingresando al sistema...");
        }
        else{
            System.out.println("no eres mayor de edad intentalo nuevamente");
        }
        
        
        
        
    }
}
