package Vectores;

import java.util.Scanner;

public class Ejercicio2Arreglos {

    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        String opcion;
        char[] op = null;
        int vocal;
        String palabra;
        char[] pal;
        do {
            vocal = 0;
            System.out.println("Introduce una palabra:");
            palabra = t.nextLine();
            pal = palabra.toCharArray();
            for (int i = 0; i < palabra.length(); i++) {
                if ((pal[i] == 'a') || (pal[i] == 'e') || (pal[i] == 'i') || (pal[i] == 'o') || (pal[i] == 'u')) {
                    vocal++;
                }
                
            }
            System.out.println("Tiene" + vocal + " vocales");
                System.out.println("Quieres teclear otra palabra: si / no");
                opcion = t.nextLine();
                op = opcion.toCharArray();
        } while ((op[0])=='s');
    }

}
