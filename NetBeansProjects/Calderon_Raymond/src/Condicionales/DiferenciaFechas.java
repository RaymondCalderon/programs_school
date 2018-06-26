
package Condicionales;

import java.util.Scanner;



/**
 *
 * @author Raymond
 */
public class DiferenciaFechas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner t = new Scanner(System.in);
        
        System.out.print("Primer Fecha ");
        System.out.print("--- ");
        System.out.print("Introduzca el Dia: ");
        int Dia1 =  t.nextInt();
        System.out.print("Introduzca el Mes: ");
        int Mes1 =  t.nextInt();
        System.out.print("Introduzca el Año: ");
        int Año1 =  t.nextInt();
        System.out.print("--- ");
        System.out.print("Segunda Fecha ");
        System.out.print("--- ");
        System.out.print("Introduzca el Dia: ");
        int Dia2 =  t.nextInt();
        System.out.print("Introduzca el Mes: ");
        int Mes2 =  t.nextInt();
        System.out.print("Introduzca el Año: ");
        int Año2 =  t.nextInt();
        
        if(Dia1>=0 && Dia1<32 && Mes1>=0 && Mes1<13 && Año1>=0 && Año1<2017 && Dia2>=0 && Dia2<32 && Mes2>=0 && Mes2<13 && Año2>=0 && Año2<2017){
        int Dias = ( (Dia2-Dia1)+30*(Mes2-Mes1)+356*(Año2-Año1) );
        System.out.print("Dias de Diferencia:" + Dias); }
         
        else{
            System.out.println("Fecha o Fechas Invalidas");
        }
    }
    
}
