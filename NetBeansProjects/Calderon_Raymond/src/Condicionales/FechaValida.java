
package Condicionales;

import java.util.Scanner;

/**
 *
 * @author Raymond
 */
public class FechaValida {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        System.out.print("Introduzca el Dia: ");
        int Dia =  t.nextInt();
        System.out.print("Introduzca el Mes: ");
        int Mes =  t.nextInt();
        System.out.print("Introduzca el Año: ");
        int Año =  t.nextInt();
        
        if(Dia>=0 && Dia<32 && Mes>=0 && Mes<13 && Año>=0 && Año<2017) {     
           System.out.println("Fecha Valida");
        }
        
        else{
            System.out.println("Fecha Invalida");
        }
    }
    
}
