/*
Bucles indeterminados
*while
*do-while
no se sabe cuantas veces se ejecutara 
por eso son determinados

Bucles determinados
*for
*for-each
se establece un limite, se sabra cuantas veces se ejecutara
 
 */
package bucles_1;
import javax.swing.*;
/**
 *
 * @author kevin
 */
public class Bucles_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String clave="Kevin";//se crea una cadena de texto llena
        
        String pass="";//almacena cadena de texto vacia
        
        /*si la condicion de while es falsa
        (la contraseña es Kevin)se sale del while*/
        while (clave.equals(pass)==false){//si clave no es igual a lo que hay en pass(false)
            
            pass=JOptionPane.showInputDialog("Introduce la contraseña");
            
            /*si la clave es diferente(false)
            a lo que hay en pass que salga contraseña incorrecta y se devuelva al while*/
            if(clave.equals(pass)==false){
                
                System.out.println("Contraseña incorrecta");
            }
        }
        System.out.println("Contraseña correcta. Acceso permitido");
    }
    
}
