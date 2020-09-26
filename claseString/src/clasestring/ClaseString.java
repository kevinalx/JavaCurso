/*
 -String no es un tipo de dato primitivo
-instanciar es darle un nombre a un objeto donde se almacenara un valor
-ejemplarizar he instanciar una clase es lo mismo
-String mi_nombre="kevin"; donde mi_nombre es un objeto(instancia, ejemplar) de la clase string
-Metodos mas usados de la clase String para manipulacion de texto:
*length(): devuelve la longitud de una cadena de caracteres
*chartAt(n): devuelve la posicion de un caracter dentro de una cadena
*substring(x,y):devuelve una subcadena dentro de la cadena, siendo X el caracter
a partir del cual se extrae e Y el numero de caracteres que quiere extraer
*equals(cadena):devuelve true si dos cadenas que se comparan son iguales y false 
si no lo son. distingue mayusculas y minisculas
*equalsIgnoreCase(cadena):igual que el anterior pero sin tener en cuenta mayusculas y minisculas

 */
package clasestring;

/**
 *
 * @author kevin
 */
public class ClaseString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nombre="Kevin";
        System.out.println("Mi nombre es " + nombre);
        
        //ejemplo de uso de length
        System.out.println("Mi nombre tiene " + nombre.length() + " letras");
        
        //ejemplo de chartAt
        System.out.println("La primera letra de mi nombre es " + nombre.charAt(0));
        
        int ultimaLetra = nombre.length();
        System.out.println("Y la ultima letra es la "+ nombre.charAt(ultimaLetra-1));
        
    }
    
}
