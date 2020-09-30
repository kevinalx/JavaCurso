/*
 en este vemos como se usa la entrada y salida de datos 
esta vez con la opcion de JOptionPane y el paquete javax.swing
 */
package entrada_salidadatos;
import javax.swing.*;//importamos el paquete y traemos todas la clases

/**
 *
 * @author kevin
 */
public class Entrada_SalidaDatos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nombre_usuario=JOptionPane.showInputDialog("Introduce tu nombre, por favor");
        
        String edad=JOptionPane.showInputDialog("Introduce la edad, por favor");
        
        int edad_usuario=Integer.parseInt(edad);//esta linea permite almacenar un dato entero de lo que hay en una variable de tipo String(el string lo convierte en entero)
        
        System.out.println("Hola " + nombre_usuario + ". el año que vienes tendras " + (edad_usuario+1) + " años");
    }
    
}
