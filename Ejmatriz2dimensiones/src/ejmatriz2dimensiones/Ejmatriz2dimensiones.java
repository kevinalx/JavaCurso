/*
 ejejmplo practico de array bidimensional
ejemplo practico de como almacenar en un array la tabla de intereses
 */
package ejmatriz2dimensiones;

/**
 *
 * @author kevin
 */
public class Ejmatriz2dimensiones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        double acumulado;
        double interes=0.10;
        
        double [][] saldo=new double[6][5];
        
        for(int i=0; i<6; i++){
            
            /*se pone la i porque se pretende almacenar
            en la primera dimension del array, se pretenden almacenar los valores
            iniciales*/
            saldo[i][0]=10000;
            acumulado=10000;
            
            /*delcaramos le segundo for con el que se recorrera la segunda dimension*/
            for(int j=1; j<5; j++){
                
                acumulado=acumulado+(acumulado*interes);
                
                /*le decimos que lo que hay en acumulado lo meta
                en la posicion correspondiente del array([i][j] */
                saldo[i][j]=acumulado;
                
            }
            /*al salir del segundo bucle for el interes se habra acumulado */
            interes=interes+0.01;
        }
        
        for(int z=0; z<6; z++){
            
            System.out.println();
            
            for(int h=0; h<5; h++){
                
                System.out.printf("%1.2f", saldo[z][h]);
                
                System.out.print(" ");
            }
            
        }
    }
    
}
