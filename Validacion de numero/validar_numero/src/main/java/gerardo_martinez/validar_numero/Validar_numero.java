/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package gerardo_martinez.validar_numero;
import java.util.Scanner;
/**
 *
 * @author Gerry-Mel
 */

//Validar que un número ingresado 
//por el usuario sea mayor o igual a 0, usando una estructura condicional if–else.
public class Validar_numero {

    public static void main(String[] args) {
        int puntuacion;
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("---Ingresa la puntuacion maxima de tu juego favorito---\n\n");
        System.out.println("Ingresa tu puntuacion:");
        puntuacion = teclado.nextInt();
        
        if(puntuacion >= 0){
            System.out.println("Exelente play to game.");
            
        }
        else{
            System.out.println("Tu puntuacion es baja sige avazando");
        }
            
            
        
        
    }
}
