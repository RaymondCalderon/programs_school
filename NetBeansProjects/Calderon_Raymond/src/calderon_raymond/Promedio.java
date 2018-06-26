
package calderon_raymond;

import java.util.Scanner;

/**
 *
 * @author Raymond
 */
public class Promedio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner t=new Scanner(System.in);
        System.out.println("Inserte la Primer Calificacion: ");
        double c1=t.nextDouble();
        System.out.println("Inserte la Segunda Calificacion: ");
        double c2=t.nextDouble();
        System.out.println("Inserte la Tercer Calificacion: ");
        double c3=t.nextDouble();
        double p=((c1+c2+c3)/3);
        System.out.println("El Promedio es de: "+ p);
    }
    
}
