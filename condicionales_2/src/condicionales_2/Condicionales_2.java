/*
 en este ejemplo usamos la estructura switch
 */
package condicionales_2;
import java.util.*;//para poder utilizar la clase scanner
import javax.swing.*;//para poder llamar la clase JOptionPane
/**
 *
 * @author kevin
 */
public class Condicionales_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada=new Scanner(System.in);//creamos el objeto de tipo scanner
        
        System.out.println("Elige una opcion: \n1: cuadrado \n2: rectangulo \n3: triangulo \n4: circulo");//esto (\n) lo que hace es un salto de linea
        
        int figura=entrada.nextInt();//se espera que el usuario ingrese un dato de tipo entero y lo almacene aca
        
        switch (figura){
            
            case 1:
                /*se usa Integer.parseInt para pasar un string a entero*/
                int lado=Integer.parseInt(JOptionPane.showInputDialog("Introduce el lado"));
                
                System.out.println("El area del cuadrado es " + Math.pow(lado,2));
                
                break;//cuando se termina un case siempre se utiliza la instruccion break
                
            case 2:
                int base=Integer.parseInt(JOptionPane.showInputDialog("Introduce la base"));
                
                int altura=Integer.parseInt(JOptionPane.showInputDialog("Introduce la altura"));
                
                System.out.println("El area del rectangulo es " + base*altura);
                
                break;
                
            case 3:
                base=Integer.parseInt(JOptionPane.showInputDialog("Introduce la base"));
                
                altura=Integer.parseInt(JOptionPane.showInputDialog("Introduce la altura"));
                
                System.out.println("El area del triangulo es " + (base*altura)/2);
                
                break;
                
            case 4:
                int radio=Integer.parseInt(JOptionPane.showInputDialog("Introduce la radio"));
                
                System.out.print("El area del circulo es ");
                
                System.out.printf("%1.2f", Math.PI*(Math.pow(radio, 2)));
                
                break;
                
            default:
                System.out.println("La opcion no existe");
                
                
                
        }
    }
    
}
