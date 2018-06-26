
package VectoresBidimensionales;

import java.util.Scanner;

/**
 *
 * @author Raymond
 */
public class ArregloNvalores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] valores;
        
        System.out.println("Cuantos Numeros Quieres ?");
        int cantidad =sc.nextInt();
        valores = new int[cantidad];
        
        sc = new Scanner(System.in);
        int valor;
        for (int i = 0; i <valores.length; i++) {
            System.out.println("Ingresa el Numero:");
            valor = sc.nextInt(); 
            valores[i] = valor;
            
        }
        System.out.println("Orden Normal:");
        for (int i=0;i<valores.length; i++){
         System.out.println(valores[i]);
     }
        System.out.println(" ");
        System.out.println("Orden Inverso:");
        for (int i = valores.length; i>0; i--) {
            System.out.println(valores[i-1]);
        }
    }
    
}
