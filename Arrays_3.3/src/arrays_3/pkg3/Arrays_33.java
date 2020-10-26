/*
esta es la continuacion de ejempo de arrays 2.2, 
seguimos estuiando los arrays bidimensionales 
 */
package arrays_3.pkg3;

/**
 *
 * @author kevin
 */
public class Arrays_33 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //delcarmos la matiriz
        int [][] matrix={
            //llenamos la matriz
            {10,15,18,19,21},
            {5,25,37,41,15},
            {7,19,32,14,90},
            {85,2,7,40,27}
        };
        
        //usamos el bucle foreach
        for(int[]fila:matrix){
        
            System.out.println();
            
        for(int z: fila){
            
            System.out.println(z + " ");
        }
    }
  }
    
}
