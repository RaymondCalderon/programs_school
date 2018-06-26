
package calderon_raymond;

import java.util.Scanner;

/**
 *
 * @author Raymond
 */
public class Numero_Mayor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
           Scanner t=new Scanner(System.in);
        System.out.println("Inserte el Primer Numero: ");
        double n1=t.nextDouble();
        System.out.println("Inserte el Segundo Numero:");
        double n2=t.nextDouble();
        System.out.println("Inserte el Tercer Numero:");
        double n3=t.nextDouble();
        
        
        if (n1>n2 && n1>n3){
            System.out.println(n1 +" es mayor que "+ n2 +" y "+ n3);
        }
        else if (n1<n2 && n2>n3){
            System.out.println(n2 +" es mayor que "+ n1 +" y "+ n3);
        }
        else {
            System.out.println(n3 +" es mayor que "+ n1 +" y "+ n2);
        }
    }
    
}
