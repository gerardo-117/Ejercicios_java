/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/*Realizar un programa que solicite 5 califiaciones de de 5 
asignaturas con ellas calcule el el promedio de un alumno e indique si esta aprobado o reprobado;
*/


package gerardo_martinez.ejercicios_if;
import java.util.Scanner;
/**
 *
 * @author Gerry-Mel
 */
public class calificaciones_if {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        double cal_1,cal_2,cal_3,cal_4,cal_5;//se abrevio la palabra calificacion y se enumero para utilizar de forma cencilla.
        double promedio;
        
        System.out.println("---Calculadora de Promedio---\n\n");
        System.out.println("Capture la primera califacion:");
        cal_1 = teclado.nextDouble();
        System.out.println("Capture la segunda califacion:");
        cal_2 = teclado.nextDouble();
        System.out.println("Capture la tercera califacion:");
        cal_3 = teclado.nextDouble();
        System.out.println("Campture la caurta califacion:");
        cal_4 = teclado.nextDouble();
        System.out.println("Campture la quinta califacion:");
        cal_5 = teclado.nextDouble();
        
        
        promedio = (cal_1 + cal_2 + cal_3 + cal_4 + cal_5)/5;
        
        
        if (promedio >=5){
            
            System.out.println("Estas aprobado, tu calificacion es:"+promedio + "\nBien echo sige asi");
            
        }else{
            System.out.println("Estas reprobado, tu calificacion es:"+promedio + "\nPonte a estudiar");
        
    }
}
}