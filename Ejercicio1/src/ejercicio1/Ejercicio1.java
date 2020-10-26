/*
 Declara dos variables numéricas (con el valor que desees), muestra por consola 
la suma, resta, multiplicación, división y módulo (resto de la división).
 */
package ejercicio1;
import java.util.Scanner;
/**
 *
 * @author kevin
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        
        int num1=0, num2=0, suma, resta, multi;
        double div, mod;
        
        System.out.println("Introduce el numero 1");
        num1=leer.nextInt();
        
        System.out.println("Introduce el numero 2");
        num2=leer.nextInt();
        
        suma=num1+num2;
        
        resta=num1-num2;
        
        multi=num1*num2;
        
        div=num1/num2;
        
        mod=num1*div;
        
        
        System.out.println("La suma es " + suma);
        
        System.out.println("La resta es " + resta );
        
        System.out.println("La multiplicacion es " + multi);
        
        System.out.println("La division es  " + div);
        
        System.out.println("el modulo de la division es " + mod);
        
        
        
        
        
    }
    
    
}
