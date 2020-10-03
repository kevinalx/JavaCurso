/*
 hacemos uso del bucle for en esta ocasion, veremos us sintaxis con un ejemplo practico
 */
package bucles_4;
import javax.swing.JOptionPane;//se importa el paquete de javax para usar joptionpane
/**
 *
 * @author kevin
 */
public class Bucles_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /*(int i=0) se declara la variable y le decimos que la inice en 0
        (i<10) le decimos que lleve la varibale hasta el valor 10
        (i++) le decimos que lo vaya aumentado de 1 en 1 con el operador ++*/
        //for(int i=0;i<10;i++){
            /*todo lo que seponga dentro del bucle for se repitara
            10 veces, en este caso mi nombre se imprime 10 veces*/
            
            //System.out.println("Kevin");
        //}
        
        //ejemplo
        
        boolean arroba=false;
        
        String mail=JOptionPane.showInputDialog("Introduce mail");
        
        /*usamos el metodo length 
        devuelve la longitud de la variable
        en este caso mail*/
        for(int i=0; i<mail.length(); i++){
            
            /*si nuestro mail tiene un arroba sera true y saldra del ciclo for*/
            if(mail.charAt(i)=='@'){
                arroba=true;
            }
            
        }
        if(arroba==true){
            
            System.out.println("Es correcto");
            
        }else{
            
            System.out.println("No es correcto");
        }
        
        /*la propiedad length mide la longitud de una varriable*/
        //System.out.println(mail.length());
    }
    
}
