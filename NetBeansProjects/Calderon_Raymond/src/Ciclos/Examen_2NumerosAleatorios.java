package Ciclos;

/**
 *
 * @author Raymond
 */
public class Examen_2NumerosAleatorios {

    public static void main(String[] args) {
        int numeroAleatorio1 ;
        int numeroAleatorio2 ;
        int suma;
        int intervalo;
        numeroAleatorio1 = (int) (Math.random() * 10 + 1);
        numeroAleatorio2 = (int) (Math.random() * 10 + 11);
        suma = numeroAleatorio1;
        intervalo = numeroAleatorio1;
        System.out.println("El 1 numero es " + numeroAleatorio1);
        System.out.println("El 2 numero es " + numeroAleatorio2);

        while (intervalo != numeroAleatorio2) {
            System.out.println(intervalo);
            suma = suma + (intervalo + 1);
            intervalo++;

        }
        System.out.println(intervalo);
        System.out.println("Suma de los Numeros = " + suma);
    }
}