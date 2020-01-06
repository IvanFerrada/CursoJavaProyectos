
package entradadatos;

import java.util.Scanner;

public class EntradaDatos {

   
    public static void main(String[] args) {
      
        Scanner entrada =new Scanner(System.in);
        int    teclado0;
        float  teclado1;
        double teclado2;
        String teclado3;
        String teclado4;
        char   teclado5;
        
        
        
        
            System.out.println("Escriba un int");
            System.out.println("Escriba un float");
            System.out.println("Escriba un double");
            System.out.println("Escriba un String");
            System.out.println("Escriba un String.nextline");
            System.out.println("Escriba un char");
        
        teclado0 =entrada.nextInt();
        
        teclado1 =entrada.nextFloat();
                
        teclado2 =entrada.nextDouble();
        
        teclado3 =entrada.next();
        
        teclado4 =entrada.nextLine();
        
        teclado5 =entrada.next().charAt(0); 
       
                
                
                
            System.out.println("Su entrada de datos  es: "+ teclado0);
            System.out.println("Su entrada de datos  es: "+ teclado1);
            System.out.println("Su entrada de datos  es: "+ teclado2);
            System.out.println("Su entrada de datos  es: "+ teclado3);
            System.out.println("Su entrada de datos .nextline  es: "+ teclado4);
            System.out.println("Su entrada de datos .: "+ teclado5);
    }
    
}
