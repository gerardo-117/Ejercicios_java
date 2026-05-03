/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package gerardo_martinez.sensor_de_temperatura;
import java.util.Scanner;
/**
 *
 * @author Gerry-Mel
 */

//Realizar un programa que lea la temperatura de un sensor y, usando una estructura
//if-else, determine si se debe activar una alarma. Si la temperatura es mayor a 50 
//grados, el programa debe activar la alarma, de lo contrario, debe indicar que el 
//sistema funciona de manera correcta.
public class Sensor_de_temperatura {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double temperatura;
        
        System.out.println("--Detector de Temperatura--");
        
        System.out.println("Detectar la temperatura: ");
        temperatura = teclado.nextDouble();
        
        if (temperatura <= 50){
            System.out.println("La temperatura esta operando de forma normal.");
        }
        else{
            System.out.println("La temperatura esta sobre 50° centigrados.");
        }
        
    }
}
