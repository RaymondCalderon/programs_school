package Condicionales;

import java.util.Scanner;

/**
 *
 * @author Raymond
 */
public class NumReves {

    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        System.out.println("Inserte un Numero entre 10 y 9999: ");
        int n = t.nextInt();

        if (n > 9 && n < 10000) {
            int i;
            for (i = 0; n > 0; n /= 10, i *= 10) {
                i += n % 10;
            }
            System.out.println("El Numero al Reves es: " + i / 10);
        } else {
            System.out.println("Numero invalido ");
        }
    }
}
