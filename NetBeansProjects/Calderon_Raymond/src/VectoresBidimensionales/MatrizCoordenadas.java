
package VectoresBidimensionales;

import java.util.Scanner;

/**
 *
 * @author Raymond
 */
public class MatrizCoordenadas {
   
    public static void main(String[] args) {
       int[][] matriz = new int[5][5];
        for (int i = 0; i <matriz.length; i++) {
            for (int j = 0; j <matriz.length; j++) {
                matriz[i][j]=(int)(Math.random()*89+10);
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println(" ");
        }
        String coordenadas;
        int fila,columna;
        do{
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese las coordenadas (Fila,Columna): ");
        coordenadas= sc.nextLine();
        
        String [] vCoordenadas = coordenadas.split(",");
        fila = Integer.parseInt(vCoordenadas[0]); 
        columna = Integer.parseInt(vCoordenadas[1]);
        if(fila>0 && columna>0){
        System.out.println(matriz[fila-1][columna-1]);
        if (matriz[fila-1][columna-1]%2==0) {
            System.out.println("Es un Numero Par");
            }
        else{
            System.out.println("Es un Numero Impar");
            } 
        }  
        }while(fila>0 && columna>0);
    System.out.println("Programa Finalizado");
    }
    
    
}
