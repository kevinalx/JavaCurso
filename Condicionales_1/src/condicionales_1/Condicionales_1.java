/*
 EMPEZAMOS CONOCER LA SINTAXIS DEL CONDICIONAL IF MEDIANTE UN SENCILLO EJEMPLO
 */
package condicionales_1;
import java.util.*;// importamos el paquete util

/**
 *
 * @author kevin
 */
public class Condicionales_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner entrada= new Scanner(System.in);// creamos el objeto tipo scanner
        
        System.out.println("Introduce tu edad, por favor");
        
        int edad=entrada.nextInt();//nextInt porque es una variable de tipo entero
        
        /*if(edad>=18){
            
            System.out.println("Eres mayor de edad");
            
        }else{
            
            System.out.println("Eres menor de edad");
        }*/
        
        //otro ejemplo de condiciones
        if(edad<18){
            
            System.out.println("Eres un adolescente");
  
        }else if(edad<40){
            
             System.out.println("Eres joven");
            
        }else if(edad<65){
            
            System.out.println("Eres maduro");
        }else{
            
             System.out.println("Cuidate");
        }
      }
    }
    

