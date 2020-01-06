
package operadores;

import java.util.Scanner;




public class Operadores {

 
    public static void main(String[] args) {
       
        Scanner entrada = new Scanner(System.in);
        
        float nm1,nm2,suma,resta,mul,div,resto;
                
            System.out.println("digita dos numeros");
            
        nm1 =entrada.nextFloat();
        nm2 =entrada.nextFloat();
        
        suma = nm1 + nm2;
        resta = nm1 - nm2;
        mul = nm1 * nm2;
        div = nm1 / nm2;
        resto = nm1 % nm2;
        
            System.out.println("la suma es :" + suma);
            System.out.println("la resta es :"+ resta);
            System.out.println("la multiplicacion es :" + mul);
            System.out.println("la division es : "+ div);
            System.out.println("el porcentaje es :"+ resto);
        
        
    }
    
}
 