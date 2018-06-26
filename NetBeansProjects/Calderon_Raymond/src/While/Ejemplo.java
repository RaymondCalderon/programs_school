package While;

import java.util.Scanner;

/**
 *
 * @author Raymond
 */
public class Ejemplo {

    public static void main(String[] args) {
        Double suma = 0.0, numero, promedio = 0.0;
        int contador = 1;
        Scanner sc = new Scanner(System.in);

        System.out.println("Cuantos numeros..??");
        int cantidad = sc.nextInt();

        while (contador <= cantidad) {
            System.out.println("Dame el numero: ");
            numero = sc.nextDouble();

            suma = suma + numero;
            contador = contador + 1;
        }
        promedio = suma / cantidad;
        System.out.println("El promedio es:" + promedio);
    }
}