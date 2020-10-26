/*
 esta vez vemos el bucle for mejorado para leer
los valores de un array,tambien denomidado bucle for-each.
elaboramos un ejemplo en el que se rellena una matriz
utilizando la clase JOptionPane y tambien
otro ejemplo donde rellenamos una matriz con numeros aleatorios 
 */
package arrays_2;

import javax.swing.JOptionPane;

/**
 *
 * @author kevin
 */
public class Arrays_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String [] paises=new String[8];//creamos la matriz paises y la rellenamos con 8
        
        /*se declara bucle for*/
        for(int i=0; i<8; i++){
            
            /*paises[i] es para que vaya almacenando las vueltas
            en la poscision correspondiente,
            (i+1) esto es para que al usuario le salga la posicion correspondiente
            de cada pais
            ejemplo: pais 1, pais 2, pais 3, etc*/
            paises[i]=JOptionPane.showInputDialog("Introduce pais " + (i+1));
        }
        /*le damos un valor a cada poscision*/
        /*paises[0]="España";
        paises[1]="Mexico";
        paises[2]="Colombia";
        paises[3]="Peru";
        paises[4]="Chile";
        paises[5]="Argentina";
        paises[6]="Ecuador";
        paises[7]="Venezuela";*/
        
        /*recorremos la matriz con el bucle for*/
        /*for(int i=0; i<paises.length; i++){
            
            System.out.println("Pais " + (i+1) + paises[i]);
        }*/
        
        /*se declara una variable del mismo tipo que la matriz
        (String), se le da el nombre a la variable(elemento),
        despues de haber declarado la matriz se coloca : y el nombre de la matriz*/
        for(String elemento:paises){
            
            System.out.println("Pais: "+ elemento);
            
        }
        
        
    }
    
}
