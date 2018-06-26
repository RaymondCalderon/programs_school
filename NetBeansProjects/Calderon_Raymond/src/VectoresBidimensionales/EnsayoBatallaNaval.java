package VectoresBidimensionales;

import java.util.Scanner;

public class EnsayoBatallaNaval {

    public static void main(String[] args) {
        //Aqui genera 
        System.out.println("Bienvenindo a Batalla Naval");
        String tablero [][] = new String [8][8];
        String ataques [][] =new String[8][8];
        for (int i = 0; i <tablero.length; i++) {
            for (int j = 0; j < tablero.length; j++) {
                tablero[i][j] = "-";
                ataques[i][j] = "."; 
            } 
        }
        for (int i = 0; i < 10; i++) {
            int a = (int)(Math.random()*8);
            int b = (int)(Math.random()*8);
            if ("-".equals(tablero[a][b])) {
              tablero [a][b]= "x";  
            }
            else{
              i--;
            }  
        }
        System.out.println(" ");
        System.out.println("Tablero Generado");
        int fila =0; 
        int columna=0;
        int naves = 10;
        int fallos= 0;
        do{ 
            System.out.println("      C O L U M N A S      ");
            System.out.print("   ");
        for (int i = 0; i < 8; i++) {
            System.out.print(i+1 +"  "); 
        }
        System.out.println(" ");
        for (int i = 0; i <tablero.length; i++) {
            System.out.print(i+1 +"  ");
            for (int j = 0; j <tablero.length; j++) {
                System.out.print(ataques[i][j] + "  "); 
             }
            System.out.println(i+1); 
        }
        System.out.print("   ");
        for (int i = 0; i < 8; i++) {
            System.out.print(i+1 +"  "); 
        }   
        Scanner sc = new Scanner(System.in);
        System.out.println("");  
        
        System.out.print("Ingrese las Coordenadas en el Siguiente Formato (Fila,Columna):");
        String coor =sc.nextLine();
        String [] vcoor = coor.split(",");
        fila = Integer.parseInt(vcoor[0]);
        columna = Integer.parseInt(vcoor[1]);
        
        if(("-".equals(tablero[fila-1][columna-1]))){ 
        System.out.println("Fallaste"); 
        ataques[fila-1][columna-1] = "X";
        fallos++;
            }
        else if("D".equals(tablero[fila-1][columna-1])){   
        System.out.println("Ya destruiste esta nave Intenta con otra Coordenada"); 
        fallos++;
        }
        else{
             System.out.println("Acertaste");
        tablero[fila-1][columna-1] = "D";
        ataques[fila-1][columna-1] = "O";
        naves--;
        System.out.println("Naves Restantes:" + naves);
            }
        } while ("-".equals(tablero[fila-1][columna-1]) || naves>0);   
        System.out.println("Has destruido mi Imperio prro :´v");
        System.out.println("Numero de Fallos:" + fallos); 
    }
}