/*
Aca se hara uso del NumberFormat
 */
package numberformat;
import javax.swing.*;
/**
 *
 * @author kevin
 */
public class NumberFormat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double x=10000.0;
        
        //System.out.println(x/3);//con esto saldran resultados muy grandes
        
    /*metodo printf tiene 2 parametros, 
    el formato que le tiene que aplicar al valor numerico("%1.2f"),
    y el valor numerico(x/3), le dara dos decimales al resultado de esa division*/
    
        //System.out.printf("%1.2f",x/3);
        
        //ejemplo aplicado
        String num1=JOptionPane.showInputDialog("Introduce un numero");
        /*el string que hay almacenado en num1 lo va a convertir a double
        utilizando parseDoubl, metodo estatico de la clase double 
        y se almacenara en un dato de tipo double (en este caso num2)*/
        double num2=Double.parseDouble(num1);
        
        System.out.print("la raiz de " + num2 + "es");//
        
        System.out.printf("%1.2f", Math.sqrt(num2));   
    }
    
}
