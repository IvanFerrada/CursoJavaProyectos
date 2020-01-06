
package operadoresmetodoroun;


public class OperadoresMetodoRoun {

 
    public static void main(String[] args) {
        
        //Redondear numeros con La clase Math.round;
        
        double numero = 4.56;
        float  numero2 = 4.44f;
        
        //Trasnformar un numero double a long con Math.round(numero);
        
        
        long  resultado = Math.round(numero);
        
        //De float en Math.round va a el resultado de tipo int; 
        
        int   resultado2 = Math.round(numero2);
        
            System.out.println("Resultado 1: "+ resultado + " "+ "Resultado2: "+" " + resultado2 );
                
       
    }
    
}
