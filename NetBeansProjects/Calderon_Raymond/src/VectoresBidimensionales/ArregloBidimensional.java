package VectoresBidimensionales;

import java.util.Scanner;

/**
 *
 * @author Raymond
 */
public class ArregloBidimensional {

    public static void main(String[] args) {
    int[][] arreglo = new int [5][5];
    
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                arreglo[i][j]=(int)(Math.random()*15+1);
            }
        }
     for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(arreglo[i][j] + " ");
            }
            System.out.println();
        }
     String respuesta = "n";
     do{
     Scanner sc = new Scanner(System.in);
        System.out.println("Dime la Fila:");
        int f =sc.nextInt();
        System.out.println("Dime la Columna:");
        int c =sc.nextInt();
        
        System.out.println("Valor:" + arreglo [f][c]);
        
        sc= new Scanner(System.in);
         System.out.println("Desea ver otro Valor??    s/n ");
         respuesta = sc.nextLine();         
     }while(respuesta.equals("s"));
    }

}
