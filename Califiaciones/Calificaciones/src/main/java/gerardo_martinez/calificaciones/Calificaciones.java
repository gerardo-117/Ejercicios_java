/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package gerardo_martinez.calificaciones;
import java.util.Scanner;
/**
 *
 * @author Gerry-Mel
 */
// Realizar un programa en el cual valides si un alumno esta reprobado o aprobado al ingresar su
//califiacion
public class Calificaciones {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        double calificacion;
        
        System.out.println("---Ingreso de calificaciones---");
        System.out.println("Ingrese la calificacion de el alumno:");
        calificacion = teclado.nextDouble();
        
        if(calificacion >= 60){
            System.out.println("el alumno esta excento no presentara extraordinario.");
        }
        else {
            System.out.println("El alumno esta reprobado debe presentar el extraordinario.");
        }
        
        
        
        
        
        
    }
}
