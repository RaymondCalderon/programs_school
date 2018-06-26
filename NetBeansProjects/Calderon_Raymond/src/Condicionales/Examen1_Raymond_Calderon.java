
package Condicionales;

import java.util.Scanner;

/**
 *
 * @author Raymond
 */
public class Examen1_Raymond_Calderon {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
          Scanner t = new Scanner(System.in);
        int numero = 0;
        do {
            System.out.println("Ingresa un Numero entre 30 y 50: ");
            numero=t.nextInt();
            
        } while (numero<30 || numero>50);
        System.out.println(" ");
        for (int i = 2; i <= numero; i++) {
            if (i%2==0) {
                System.out.println(i);
            }
    
        }
    }
    
}
