
package Circulo;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author Raymond
 */
public class Circulo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            Double radio;
            
            Scanner t = new Scanner(System.in);
            System.out.println( "Ingrese el Radio : ");
            radio = t.nextDouble();
        
        Double Area = Math.PI * radio * radio;
        Double Circunferencia = Math.PI * (radio + radio);
        
            DecimalFormat df = new DecimalFormat ("#,##");
            System.out.println("El area del circulo es: " + df.format(Area) );
            System.out.println("La circunferencia del circulo es: "+ df.format(Circunferencia) );
        
    }
    
}
