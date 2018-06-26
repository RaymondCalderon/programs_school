package Ciclos;

import java.util.Scanner;

/**
 *
 * @author Raymond
 */
public class NnumerosPar_Impar {

    public static void main(String[] args) {

        Scanner t = new Scanner(System.in);
        System.out.println("Ingresa un Numero para saber si es par o impar, Ingresa un Numero menor a 0 para finalizar");
        int n = t.nextInt();

        while (n > 0) {
            if (n > 0);
            {
                if (n % 2 == 0) {
                    System.out.println("El numero " + n + " es Par");
                } else {
                    System.out.println("El numero " + n + " es Impar");
                }
            }
            System.out.println("Ingresa un Numero para saber si es par o impar, Ingresa un Numero menor a 0 para finalizar");
            n = t.nextInt();
        }
    }
}
