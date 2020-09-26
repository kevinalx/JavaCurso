/*
 aprender a utilizar el metodo substring, equals.
 */
package clasestring2;

/**
 *
 * @author kevin
 */
public class ClaseString2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //metodo substring
        /*String frase="Hoy es un estupendo dia para aprender en programar en java";
        String frase_resumen=frase.substring(1, 3);//1 desde la posicion que quiero extraer, 3 la posicion que no quiero extraer
        System.out.println(frase_resumen);*/
        
        //metodo equals
        String alumno1, alumno2;
        alumno1="David";
        alumno2="david";
        
        //true
        System.out.println(alumno1.equalsIgnoreCase(alumno2));//equalsIgnorecase ignora si son mayusculas o minisculas
        //false
        System.out.println(alumno1.equals(alumno2));//esta comparando dos cadenas de caracteres    
    }
    
}
