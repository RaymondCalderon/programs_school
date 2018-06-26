package Vectores;

import java.util.Scanner;

/**
 *
 * @author Raymond
 */
public class ArregloMenu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    int opcion = 0;
    Scanner sc = new Scanner(System.in);
    int [] arreglo = new int[5];
    
    do{
        System.out.println(" ");
        System.out.println("Selecciona una Opcion");
        System.out.println("1. Llenar Arreglo");
        System.out.println("2. Imprimir Arreglo");
        System.out.println("3. Salir");
        
        System.out.println("Opcion: ");
        opcion = sc.nextInt();
        if(opcion == 1)
        {
            for(int i=0; i<arreglo.length; i++)
            {
            arreglo[i] = (int)(Math.random()*25+1);
            }
        }
        else if(opcion == 2)
        {
            for (int i = 0; i <arreglo.length; i++) 
            {
                System.out.print(arreglo[i]+" ");    
            }
        }
    }while(opcion!=3);
    
    
    }

}
