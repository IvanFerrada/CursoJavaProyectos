//Ejercicio 2 Hacer un programa que calcule e imprima el salario semanal  de un empleado a partir  de sus horas  trabajadas  y de su salario por hora ;
package ejercicio2operadores;

import java.util.Scanner;


public class Ejercicio2Operadores {

    
    public static void main(String[] args) {
       
        Scanner teclado = new Scanner(System.in);
        
            System.out.println("ingrese la cantidad de horas del empleado");
        
        int empleado = teclado.nextInt();
        
        int horas = 150;
        
        int resultado = empleado * horas;
        
        System.out.println("El sueldo por hora es de:"+ horas);
        
        
        System.out.println("El sueldo de sus horas semanales es de: "+ resultado);
        
        
    }
    
}
