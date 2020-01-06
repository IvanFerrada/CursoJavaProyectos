
package joptionpane;

import javax.swing.JOptionPane;


public class Joptionpane {

   
    public static void main(String[] args) {
        String cadena;
        int entero;
        char letra;
        double decimal;
        
        //Mostrar un mensaje en patalla con entrada de datos JOptionPane.showInputDialog();
        
        cadena = JOptionPane.showInputDialog("digite una cadena");
        
        // pasar el String a Integer.parseInt();
        
        entero = Integer.parseInt(JOptionPane.showInputDialog("digite un entero"));
        
        // .charAt(0) guarda la posicion 0 del string
        
        letra =  JOptionPane.showInputDialog("digite una letra").charAt(0);
       
        //pasar el string a Double.parseDouble(); 
        //pasar el string a Float.parseFloar();
        
        decimal = Double.parseDouble(JOptionPane.showInputDialog("digite un decimal"));
        
        //mostrar mensaje en pantalla salida JOptionPane.showMessageDialog(null, "");
        
        JOptionPane.showMessageDialog(null, "la cadena es: "+cadena);
        JOptionPane.showMessageDialog(null,"el entero es: "+entero);
        JOptionPane.showMessageDialog(null,"la letra es:  "+letra);
        JOptionPane.showMessageDialog(null,"el decimal es: "+decimal);
        
        
    }
    
}
