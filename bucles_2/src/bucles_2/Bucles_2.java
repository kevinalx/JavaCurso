/*
se genera codigo de como una especie de juego
se trata de adivinar el numero con la menor cantidad de intentos posibles
 */
package bucles_2;
import java.util.*;//importamos el paquete para usar la clase scanner
/**
 *
 * @author kevin
 */
public class Bucles_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /*usamos la refundiciones para convertir dobles a enteros*/
        int aleatorio =(int)(Math.random()*100);
        
        Scanner entrada=new Scanner(System.in);
        
        int numero=0;
        
        int intentos=0;
        
        /*mientras numero sea diferente de aleatorio*/
        while(numero!=aleatorio){
            intentos++;//se va a incrementar a medida que hago intentos
            System.out.println("Introduce un numero");
            
            numero=entrada.nextInt();
            
            /*si el numero que introduce es mas bajo que se ejecute esta linea*/
            if(aleatorio<numero){
                
                System.out.println("Mas bajo");
                
            }else if(aleatorio>numero){
                
                System.out.println("Mas alto");
               
            }
        }
        System.out.println("Correcto. Lo has conseguido en " + intentos +" intentos");
    }
    
}
