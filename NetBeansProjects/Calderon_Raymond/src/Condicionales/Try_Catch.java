
package Condicionales;

import java.util.Scanner;

/**
 *
 * @author Raymond
 */
public class Try_Catch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero =0;
        boolean esNumero;
        do{
        Scanner sc = new Scanner(System.in);
        System.out.print("Dame un Numero:");
        try{
            numero = sc.nextInt();
            esNumero = true;
        }
        catch(Exception e){
            System.out.println("Solo se admiten Numeros");
           esNumero= false;
        }
        }while(!esNumero);
        
        System.out.println("El numero es:" + numero);
    }
    
}
