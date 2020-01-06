
package clasemath;

import java.util.Scanner;


public class ClaseMath {

    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        // Math.sqrt(9) solo sirve con double 
        
        
       
            
       int i = 0;     
       do{
        System.out.println("**************************************************");
        System.out.println("* Digite un numero para sacar su raiz cuadrada!! *");
        System.out.println("**************************************************");
            
            double entrada = teclado.nextDouble(); 
            double raiz = Math.sqrt(entrada);
            
            System.out.println("************************");
            System.out.println("* Su raiz cuadrada es: *"+raiz);
            System.out.println("***********************");
       }while(i<4);
            
        
    }
    
}
