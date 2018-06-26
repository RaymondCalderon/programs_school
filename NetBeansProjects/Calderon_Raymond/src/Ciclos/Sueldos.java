package Ciclos;

import java.util.Scanner;

/**
 *
 * @author Raymond
 */
public class Sueldos {

    public static void main(String[] args) {
        String nombre;
        double impuesto = 0.0, sueldo = 0.0, sueldoFinal = 0.0;
        final double salarioHora = 50.00;
        int horas, i;

        for (i = 1; i <= 3; i++) {
            Scanner t = new Scanner(System.in);
            System.out.println("Ingresa el nombre del trabajador : ");
            nombre = t.nextLine();
            System.out.println("Ingrese las Horas Trabajadas");
            horas = t.nextInt();

            sueldo = salarioHora * horas;
            if (sueldo > 10000) {
                impuesto = sueldo * 0.10;
            } else if (sueldo > 6000) {
                impuesto = sueldo * 0.08;
            } else if (sueldo > 3000) {
                impuesto = sueldo * 0.05;
            }
           sueldoFinal = sueldo - impuesto;

            System.out.println(
                    "Nombre:" + nombre + "|"
                    + "Sueldo:" + sueldo + "|"
                    + "Impuesto:" + impuesto + "|"
                    + "Sueldo Final:" + sueldoFinal);
        }
    }
}