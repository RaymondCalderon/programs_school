package Ciclos;

import java.util.Scanner;

/**
 *
 * @author Raymond
 */
public class Tablas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        int num = 0;
        do {
            System.out.println("Dame un numero entre 1 y 10:");
            num = t.nextInt();
        } while (num <= 0 || num > 10);

        for (int i = 1; i <= 10; i++) {
            System.out.println(num + "x" + i + "=" + num * i);
        }
    }

}