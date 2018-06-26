package While;

import java.util.Scanner;

/**
 *
 * @author Raymond
 */
public class EjemploFor {

    public static void main(String[] args) {
        int i;
        double suma = 0.0, numero, promedio;

        Scanner sc = new Scanner(System.in);

        System.out.println("Cuantas calificaciones son ??");
        int cantidad = sc.nextInt();

        for (i = 1; i <= cantidad; i++) {
            System.out.println("Dame la calificacion: ");
            numero = sc.nextDouble();

            suma = suma + numero;

        }
        promedio = suma / cantidad;
        System.out.println("El promedio es:" + promedio);
    }
}
