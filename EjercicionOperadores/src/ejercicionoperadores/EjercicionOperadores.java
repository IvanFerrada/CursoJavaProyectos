//*Ejercicio 1: Hacer un programa que calcule e imprima la suma de  3 calificaciones. ;
package ejercicionoperadores;

import java.util.Scanner;



public class EjercicionOperadores {

    
    public static void main(String[] args) {
       
        Scanner teclas = new Scanner(System.in);
        
        float nota1,nota2,nota3,suma;
        
            //Guardar tres notas ;
            System.out.println("Digite 3 calificaciones: ");
            
            nota1 = teclas.nextFloat();
            nota2 = teclas.nextFloat();
            nota3 = teclas.nextFloat();      
            
                System.out.println("sus calificaciones son: "+ nota1 +"  "+ nota2 +"  "+ nota3);
                
                suma = nota1 + nota2 + nota3;
                 
                //  /n es un salto de linea;
                System.out.println("/n");
                System.out.println("La suma de las calificaciones es: "+ suma);
                   
        
        
    }
    
}
