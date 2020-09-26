/*
 estructuras principales #6, aprendidendo a manejar la clase math para hacer
operaciones matematicas
 */
package clasemath;

/**
 *
 * @author kevin
 */
public class ClaseMath {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //double raiz=Math.sqrt(9);
        
        //float num1=5.85F;//poner una F para las variables tipo float
        double num1=5.85;
        //esto se llama refundicion al poner un (int) entre la variable y la clase
        //Math, se convierte la variable en un int 
        int resultado=(int)Math.round(num1);
        
        System.out.print(resultado);
        
        //ejemplo 2
        double base=5;
        
        double exponente=3;
        
        double resultado2=Math.pow(base,exponente);
        
        System.out.println("El resultado de "+ base +" Elevado a " + exponente +"es "+ resultado);
        
        
    }
    
}
