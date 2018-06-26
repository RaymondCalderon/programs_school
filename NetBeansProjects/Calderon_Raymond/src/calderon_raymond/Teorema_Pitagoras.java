
package calderon_raymond;

import java.util.Scanner;

/**
 *
 * @author Raymond
 */
public class Teorema_Pitagoras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          Double a, b, c;

           Scanner sc =new Scanner(System.in);
           System.out.println("Lado 1:  ");
           a = sc.nextDouble();
           System.out.println("Lado 2:  ");
           b = sc.nextDouble();
        
        a = Math.pow(a, 2);
        b = Math.pow(b, 2);
        c = Math.sqrt(a+b);
        System.out.println("Hipotenusa:" +c);
    }
    
}
