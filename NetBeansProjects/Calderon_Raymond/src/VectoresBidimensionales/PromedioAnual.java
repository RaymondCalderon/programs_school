package VectoresBidimensionales;

import java.text.DecimalFormat;

/**
 *
 * @author Raymond
 */
public class PromedioAnual {

    public static void main(String[] args) {
        double anual = 0;
        double promedio = 0;
        double temp[] = new double[12];
        String meses[] = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
        System.out.println("Temperatura Promedio Mensual:");
        for (int i = 0; i < temp.length; i++) {
            temp[i] = (double) (Math.random() * 40 + 1);
            DecimalFormat df = new DecimalFormat("0.00");
            System.out.println(meses[i] + "=" + df.format(temp[i]) + "°C");
            anual = anual + (temp[i]);

        }
        promedio = anual / 12;
        System.out.println("   ");
        DecimalFormat df = new DecimalFormat("0.00");
        System.out.println("Promedio Anual :" + df.format(promedio) + "°C");
        System.out.println("    ");

        for (int i = 0; i < meses.length; i++) {
            if (temp[i] > promedio) {
                System.out.println("La Temperatura Promedio de " + meses[i] + " es Mayor al Promedio Anual");
            } else {
                System.out.println("La Temperatura Promedio de " + meses[i] + " es Menor al Promedio Anual");
            }
        }
    }
}