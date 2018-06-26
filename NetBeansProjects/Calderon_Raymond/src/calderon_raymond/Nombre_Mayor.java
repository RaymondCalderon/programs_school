
package calderon_raymond;

import java.util.Scanner;

/**
 *
 * @author Raymond
 */
public class Nombre_Mayor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
           Scanner t=new Scanner(System.in);
        System.out.println("Inserte el Primer Nombre: ");
        String n1 = t.nextLine();
        int c1 = n1.length ();
        System.out.println("Inserte el Segundo Nombre:");
        String n2 = t.nextLine();
        int c2 = n2.length ();
        System.out.println("Inserte el Tercer Nombre:");
        String n3 = t.nextLine();
        int c3 = n3.length ();
        
        if (c1>c2 && c1>c3){
            System.out.println(n1 +" tiene mas caracteres que "+ n2 +" y "+ n3);
        }
        else if (c1<c2 && c2>c3){
            System.out.println(n2 +" tiene mas caracteres que "+ n1 +" y "+ n3);
        }
        else {
            System.out.println(n3 +" tiene mas caracteres que "+ n1 +" y "+ n2);
        }
    }
    
}
