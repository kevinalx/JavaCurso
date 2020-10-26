/*
 este codigo es la continuacion del codigo de bucles 4,
acaa se soluciona el error de las arrobas para que solo permita ingresar
solo una arroba, cambiamos la variable arroba de tipo boolean
a int para poder definir que solo se podra usar una arroba
 */
package bucles_5;

import javax.swing.JOptionPane;

/**
 *
 * @author kevin
 */
public class Bucles_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          int arroba=0;
          
          boolean punto=false;
        
        String mail=JOptionPane.showInputDialog("Introduce mail");
        
        /*usamos el metodo length 
        devuelve la longitud de la variable
        en este caso mail*/
        for(int i=0; i<mail.length(); i++){
            
            /*si nuestro mail tiene un arroba sera true y saldra del ciclo for*/
            if(mail.charAt(i)=='@'){
                
                /*si encuentra una arroba en la direccion de correo
                la variable pasara a valer 1*/
                arroba++;
            }
            /*si hay un punto en el correo se ingresara al if si cumple la condicion varaible valdra true
            de lo contrario sera false que es el valor inicial de la varaible punto*/
            if(mail.charAt(i)=='.'){
                
                punto=true;
            }
        }
        /*solo si las dos condiciones son ciertas sera correcto
        por eso se usa el operador '&&' para que las dos se cumplan*/
        if(arroba==1 && punto==true){
            
            System.out.println("Es correcto");
            
        }else{
            
            System.out.println("No es correcto");
        }
        
        
    }
    
}
