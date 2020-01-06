// Guillermo tiene una cantidad en dolares . Luis tiene la mitad de que posee Guillermo.
// Juan tiene la mitad de Guillermo y Luis juntos. Hacer un programa que calcule e imprima la cantidad de dolares entre los tres
package ejerciciooperadores3;

import java.util.Scanner;

public class EjercicioOperadores3 {

    
   
    public static void main(String[] args) {
        Scanner teclado = new  Scanner(System.in);
        
            System.out.println("ingrese la cantidad de dolares de Guillermo!!");
            
            
        float guillermo = teclado.nextFloat();
        
        float luis  = guillermo / 2;
        
        float juan = guillermo + luis / 2;
        
        float total = guillermo + luis + juan;
        
            System.out.println("el total de la suma de dolares entre guillermo luis y juan es: " + total);
            
        
        
        
        
        
    }
    
}
