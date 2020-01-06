//La calificacion final de un estudiante de informatica se calcula con base alas calificaciones de cuatro aspectos de su rendimiento  academico
//participacion primer examen parcial segundo parcial  y examen final . Sabiendo  que las calificaciones  anteriores  entran ala calificacion final  con ponderaciones 
//10% 20% 25% y 40% Hacer un programa  que calcule  e imprima  la calificacion final obtenida por un estudiante


package pkg5.operadorescalificación;

import java.util.Scanner;


public class OperadoresCalificación {

    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        float participacion, primerExamen,segundoExamen,examenFinal,notaFinal;
        
        
        // pedir los datos de participacion
            System.out.println("digite la nota de participacion");
        
        participacion = teclado.nextFloat();
        
            System.out.println("digite la nota del primer examen parcial");
        
        primerExamen = teclado.nextFloat();
        
            System.out.println("digite la nota del segundo examen parcial");
            
        segundoExamen = teclado.nextFloat();
        
        
            System.out.println("digite la nota del examen final ");
            
        examenFinal = teclado.nextFloat();
        
        
        
        participacion *= 0.10f;
        
        primerExamen  *= 0.25f;
        
        segundoExamen *= 0.25f;
        
        examenFinal   *= 0.40f;
        
        notaFinal = participacion + primerExamen + segundoExamen + examenFinal;
            
            
            System.out.println("La nota final del alumno es : "+ notaFinal);
            
        
        
        
                
                
        
        
       
    }
    
 
