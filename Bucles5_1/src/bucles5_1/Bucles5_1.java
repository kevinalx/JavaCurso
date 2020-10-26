/*
 otro ejemplo de bucles con el bucle for, hacemos un codigo que calcule
el factorial de un numero
 */
package bucles5_1;
import javax.swing.*;//importamos el paquete java

/**
 *
 * @author kevin
 */
public class Bucles5_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //int resultado=1;
        long resultado = 1L;
        
        /*JOptionPane recibe un dato de tipo String
        pero la variable numero esta en entero por eso usamos 
        el metodo parseInt para convertir string a entero*/
        int numero=Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero"));
        
        for(int i=numero;i>0;i--){
            
            resultado=resultado*i;
        }
        System.out.println("El factorial de " + numero + " es " + resultado);
    }
    
}
