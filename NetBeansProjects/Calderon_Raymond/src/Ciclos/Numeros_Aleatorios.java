package Ciclos;

/**
 *
 * @author Raymond
 */
public class Numeros_Aleatorios {

    public static void main(String[] args) {
        int numeroAleatorio = 1;
        int repeticiones = 0, pares = 0, impares = 0;

        while (numeroAleatorio != 99) {
            numeroAleatorio = (int) (Math.random() * 99 + 1);
            System.out.println(numeroAleatorio);
            repeticiones++;
            if (numeroAleatorio % 2 == 0) {
                pares++;
            } else {
                impares++;

            }
        }
        while (numeroAleatorio != 99);
        System.out.println("Numeros generados: " + repeticiones);
        System.out.println("Pares: " + pares);
        System.out.println("Impares: " + impares);
    }

}
