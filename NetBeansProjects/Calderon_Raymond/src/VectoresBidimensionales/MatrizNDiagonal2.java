
package VectoresBidimensionales;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author Raymond
 */
public class MatrizNDiagonal2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       double [][]arreglo;
       
        System.out.println("Cuantas Filas??");
        int a = sc.nextInt();
        System.out.println("Cuantas Columnas??");
        int b = sc.nextInt();
        arreglo = new double [a][b];
        DecimalFormat df = new DecimalFormat("0.00");
        
        double valor;
        for (int i = 0; i <arreglo.length; i++) {
            for (int j = 0; j <arreglo.length; j++) {
            valor = Math.random()*99+1;
            arreglo[i][j] = valor;
            }
        }
        for (int i = 0; i <arreglo.length; i++) {
            for (int j = 0; j <arreglo.length; j++) {
                System.out.print(df.format(arreglo[i][j]) + " ");
            }
            System.out.println(" ");
        }
        System.out.println("  ");
        System.out.println("Diagonal Normal");
        for (int i = 0; i <arreglo.length; i++) {
          System.out.println(df.format(arreglo[i][i]) + " ");      
        }
        System.out.println(" ");
        System.out.println("Diagonal Inversa");
        
        for (int i = 0; i < arreglo.length; i++) {
            for (int j = arreglo.length - 1; j >= 0; j--) {
                if (i+j==arreglo.length -1) {
                   System.out.println(df.format(arreglo[i][j]) + " "); 
                }
                
            }
        }
    }
    
}
