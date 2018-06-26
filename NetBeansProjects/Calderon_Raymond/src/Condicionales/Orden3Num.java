package Condicionales;

import java.util.Scanner;

/**
 *
 * @author Raymond
 */
public class Orden3Num {

    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        System.out.println("Ingrese el Primer Numero: ");
        int n1 = t.nextInt();
        System.out.println("Ingrese el Segundo Numero: ");
        int n2 = t.nextInt();
        System.out.println("Ingrese el Tercer Numero: ");
        int n3 = t.nextInt();

        if (n1 > n2 && n2 > n3) {
            System.out.println("Orden:" + n1 + "-" + n2 + "-" + n3);
        } else if (n2 > n3 && n3 > n1) {
            System.out.println("Orden:" + n2 + "-" + n3 + "-" + n1);
        } else if (n3 > n1 && n1 > n2) {
            System.out.println("Orden:" + n3 + "-" + n1 + "-" + n2);
        } else if (n1 > n3 && n3 > n2) {
            System.out.println("Orden:" + n1 + "-" + n3 + "-" + n2);
        } else if (n2 > n1 && n1 > n3) {
            System.out.println("Orden:" + n2 + "-" + n1 + "-" + n3);
        } else {     //(n3>n2&&n2>n1
            System.out.println("Orden:" + n3 + "-" + n2 + "-" + n1);
        }
    }
}