package Condicionales;

import java.util.Scanner;

/**
 *
 * @author Raymond
 */
public class Multiplo3 {

    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        System.out.println("Inserte un Numero: ");
        int n = t.nextInt();

        if (n % 3 == 0) {
            System.out.println("El Numero " + n + " es Multiplo de 3");
        } else {
            System.out.println("El Numero " + n + " no es Multiplo de 3");
        }
    }
}