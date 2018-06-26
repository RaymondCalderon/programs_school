package Vectores;

import java.util.Scanner;

/**
 *
 * @author Raymond
 */
public class ArregloDeNombres {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     
     String[] nombres; 
     
     System.out.println("Cuantos nombres quieres guardar ? ");
     int cantidad =sc.nextInt();
     nombres = new String[cantidad];
     
       sc = new Scanner(System.in);
     //Este bloque de codigo sirve para llenar el arreglo
     String nombre;
     for(int i=0;i<nombres.length;i++)
     {
         System.out.println("Ingresa el Nombre:");
       nombre = sc.nextLine(); //Aqui capturo el nombre desde teclado 
       nombres[i] = nombre; //Almacenamos el nombre en el cuatro
       
     }
     /*
     Este bloque de codigo sirve para imprimir en pantalla 
     el arreglo
     */
     
     for (int i=0;i<nombres.length; i++){
         System.out.println(i +". "+ nombres[i]);
     }
    } 

}
