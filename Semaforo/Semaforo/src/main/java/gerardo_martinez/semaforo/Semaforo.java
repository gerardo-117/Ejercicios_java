/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package gerardo_martinez.semaforo;
import java.util.Scanner;
/**
 *
 * @author Gerry-Mel
 */

//Realiza un programa que al ingresar un numero mande un mensaje 
public class Semaforo {

    public static void main(String[] args) {
        int color;
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("--SEMAFORO--\n");
        System.out.println("Escoge un color \n");
        System.out.println("1)Rojo\n");
        System.out.println("2)Amarillo\n");
        System.out.println("3)Verde\n");
        
        System.out.println("Ingresa el color:");
        color = teclado.nextInt();
        
        if (color ==1){
            System.out.println("Alto alli esta el ROJO.");
        } else if (color == 2){
            System.out.println("Tome su precauisones esta el AMARILLO.");
        } else if (color == 3){
            System.out.println("Siga su camino ya esta el VERDE");
        } else {
            System.out.println("ese numero es invalido.");
        }
        
       
        
    }
}
