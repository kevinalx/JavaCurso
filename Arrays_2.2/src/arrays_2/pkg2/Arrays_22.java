/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays_2.pkg2;

/**
 *
 * @author kevin
 */
public class Arrays_22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int[] matriz_aleatorios=new int[150];
        
        for(int i=0; i<matriz_aleatorios.length; i++){
            
            /*Math.round es para que nos redondee
            Math.random*100 para que saca numeros al azar del 0 al 100
            */
            matriz_aleatorios[i]=(int)Math.round(Math.random()*100);
            
        }
        /*creamos el bucle for simplificado para recorrer la matriz*/
        for(int numeros:matriz_aleatorios){
            
            /*para que imprima un numero a continuacion del otro*/
            System.out.print(numeros);
        }
    }
    
}
