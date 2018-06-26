package Ciclos;

import java.util.Scanner;

/**
 *
 * @author Raymond
 */
public class JuegoMayorMenor {

    public static void main(String[] args) {
        int numeroAleatorio = (int) (Math.random() * 99 + 1);
        System.out.println("Numero Generado ");
        System.out.println("Quieres Adivinarlo ?");

        Scanner t = new Scanner(System.in);
        int numeroJugador = 0;
        do {
            System.out.print("Dame un Numero : ");
            numeroJugador = t.nextInt();

            if (numeroJugador > numeroAleatorio) {
                System.out.println("Menor");
            } else if (numeroJugador < numeroAleatorio) {
                System.out.println("Mayor");
            }
        } while (numeroAleatorio != numeroJugador);

        System.out.println("Acertaste!!");
    }
}
