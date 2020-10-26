/*
 Matrices, arrays, arreglos los tres terminos hacen referencia a lo mismo
es una estructura de datos que contiene una coleccion de valores del mismo tipo
sirve para almacenar valores que normalmente tienen alguna relacion entre si
su sintaxis es int[]mi_matriz=new int[10];
 */
package arrays_1;

/**
 *
 * @author kevin
 */
public class Arrays_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //ejemplo de matriz
        
        /*se declara la matriz*/
        //int [] matriz=new int[5];
        
        /*se inicia la matriz de 5 posiciones*/
        /*matriz[0]=5;
        matriz[1]=38;
        matriz[2]=-15;
        matriz[3]=92;
        matriz[4]=71;*/
        
        /*declaracion e iniciacion en la misma linea*/
        int [] matriz={5, 38, -15, 92, 71, 95, 85, 65, 14};/*desventaja de esta matriz no muestra la posicion
        otra opcion seria usar el metodo length*/
        
        /*imprimimos una poscision en especifico*/
        //System.out.println(matriz[3]);
        
        /*el interprete de java tendra en cuenta la i que vlae 0
        es decir va a impimir el 5 ya que esta en la posicion cero
        va a ir arriba y el cero lo reemplazara en 1, y va ir a imprimir
        lo que esta en la variable 1 en este caso 38 y asi hasta llegar a i=4*/
        
        for(int i=0; i<matriz.length; i++){
            
            System.out.println("valor del indice " + i + " = " + matriz[i]);
        }
        
        
    }
    
}
