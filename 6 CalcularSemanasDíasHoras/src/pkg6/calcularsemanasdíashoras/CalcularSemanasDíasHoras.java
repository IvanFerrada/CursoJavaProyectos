//  Construir un programa  que dado un numero  total dse horas  devuelva  el numero de semanas diaz y horas  
//  equivalentes. Por ejemplo , dado  un total de 1000 horas  de mostrar 5 semanas ,  6 dias  y 16 horas ;
package pkg6.calcularsemanasdíashoras;

import java.util.Scanner;


public class CalcularSemanasDíasHoras {

    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        
        int horasTotales,semanas,diaz,horas;
        
        
            System.out.println("digite las horas");
            
            
        horasTotales = teclado.nextInt();
        
        
        semanas = horasTotales / 168;
                 
        diaz  = horasTotales % 168 / 24 ;
                
        horas  = horasTotales % 24;       
        
            System.out.println("El equivalente es: ");
            
            System.out.println("semanas: " + semanas);
            
            System.out.println("diaz: " + diaz);
        
            System.out.println("horas: " + horas);
            
            
        
        
            
   
            
        
       
    }
    
}
