/*
 en esta ocasion empezamos arrays tres
veremos que son las matrices bidimensionales
su sintaxis y un ejemplo practico
 */
package arrays_3;

/**
 *
 * @author kevin
 */
public class Arrays_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /*cuando es una matriz de dos dimensiones
        se colocan 2 cortchetes, cuando son de tres se colocan
        3 corchetes y asi sucesivamente*/
        int [][] matriz=new int[4][5]; //en la primera matriz 4 elementos y en la segunda 5 elementos
        
        matriz[0][0]=15;
        matriz[0][1]=21;
        matriz[0][2]=18;
        matriz[0][3]=9;
        matriz[0][4]=15;  
        
        matriz[1][0]=10;
        matriz[1][1]=52;
        matriz[1][2]=17;
        matriz[1][3]=19;
        matriz[1][4]=7;
        
        matriz[2][0]=19;
        matriz[2][1]=2;
        matriz[2][2]=19;
        matriz[2][3]=17;
        matriz[2][4]=7;
        
        matriz[3][0]=92;
        matriz[3][1]=13;
        matriz[3][2]=13;
        matriz[3][3]=32;
        matriz[3][4]=41;
        
        /*este bucle for se encargara de recorrer la primera dimension
        de la matriz por eso se pone <4*/
        for (int i=0; i<4; i++){
            
            /*este bucle for recorre la segunda dimension*/
            for(int j=0; j<5; j++){
                
            }
            
        }
    }
    
}
