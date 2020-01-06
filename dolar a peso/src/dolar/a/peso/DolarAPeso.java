
package dolar.a.peso;


import java.util.Scanner;


public class DolarAPeso {

  
  
    public static void main(String[] args) {
        System.out.println("¿Monto?");
        
        
        Scanner sc =new Scanner(System.in);
        
        
        int dolar=57;
        
        int teclado = sc.nextInt();
        
        int resultado =0;
        
        resultado =(teclado * dolar);
        
    
        System.out.println(resultado);
         
       
       
    }
    
}
