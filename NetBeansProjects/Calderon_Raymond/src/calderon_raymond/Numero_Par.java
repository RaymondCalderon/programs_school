
package calderon_raymond;

import java.util.Scanner;

/**
 *
 * @author Raymond
 */
public class Numero_Par {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          Scanner t=new Scanner(System.in);
        System.out.println("Inserte un Numero: ");
        int n= t.nextInt();
        
        if (n%2==0){
            System.out.println("El Numero "+ n +" es Par");
        }
        else{
            System.out.println("El Numero "+ n +" es Impar");
    }
    
   } 
}
