/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entradadatos;
import java.util.*;//se importa el api para que funcione el Scanner

/**
 *
 * @author kevin
 */
public class EntradaDatos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);//se crea objeto de tipo Scanner
        
        System.out.println("Introduce tu nombre, por favor");
        
        String nombre_usuario=leer.nextLine();//espera un valor de tipo string  y cuando lo reciba se almacenara
        
        System.out.println("Introduce edad, por favor");
        
        int edad=leer.nextInt();//espera a que se ingrese dato de tipo entero cuando lo ingrese se almacenara
        
        System.out.println("hola " + nombre_usuario + ". El año que viene tendras " + (edad+1)+ " años");
    }
    
}
