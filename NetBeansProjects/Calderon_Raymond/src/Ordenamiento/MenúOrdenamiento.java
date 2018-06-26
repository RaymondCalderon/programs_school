/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordenacion;

import java.util.Scanner;

/**
 *
 * @author Jesús
 */
public class MenúOrdenamiento {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int opcion=0;
        boolean intercambio;
        do{
            try{
            Scanner sc= new Scanner(System.in);
            opcion=0;
            System.out.println("");
            System.out.println("Selecciona una opcion con la que quieres ordenar");
            System.out.println("1.Algoritmo de Burbuja");
            System.out.println("2.Algoritmo de Inserción");
            System.out.println("3.Algoritmo de Selección");
            System.out.println("4.Algoritmo de Quicksort");
            System.out.println("5.Salir");
            
            System.out.print("Opcion: ");
            opcion= sc.nextInt();
            if(opcion==1){
                int cantidad = 0;
                
                int[] arreglo;
                System.out.println("¿Cuantos numeros quieres?");
                int numero= sc.nextInt();
                arreglo= new int[numero];
                System.out.println("Arreglo Original");
                for (int i = 0; i < arreglo.length; i++) {
                    arreglo[i] = (int) (Math.random() * 49 + 1);
                    System.out.print(" " + arreglo[i]);
                }
                System.out.println("");
        do {
            intercambio = false;
            for (int i = 0; i < arreglo.length; i++) {
                try {
                    if (arreglo[i] > arreglo[i + 1]) {
                        int temporal = arreglo[i + 1];
                        arreglo[i + 1] = arreglo[i];
                        arreglo[i] = temporal;
                        intercambio = true;

                        // <editor-fold defaultstate="collapsed" desc="** Impresión paso a paso **">
                        System.out.println("");
                        System.out.print(++cantidad + ". ");
                        for (int x = 0; x < arreglo.length; x++) {
                            System.out.print(" " + arreglo[x]);
                        }
                        Thread.sleep(300);
                        // </editor-fold>
                    }
                } catch (Exception e) {
                }
            }
        } while (intercambio == true);

        // <editor-fold desc="** Impresión del arreglo a pantalla **">
        System.out.println("");
        System.out.println("\nArreglo Ordenado:");
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(" " + arreglo[i]);
        }
        System.out.println();
        // </editor-fold>
            }
            else if(opcion==2){
            int[] arreglo;
                System.out.println("¿Cuantos numeros quieres?");
                int numero= sc.nextInt();
                arreglo= new int[numero];
                System.out.println("Arreglo Original");
                for (int i = 0; i < arreglo.length; i++) {
                    arreglo[i] = (int) (Math.random() * 49 + 1);
                    System.out.print(" " + arreglo[i]);
                }
                System.out.println("");
            for (int i = 1; i < arreglo.length; i++) {
            int aux = arreglo[i];
            int j = i - 1;
            while (j >= 0 && arreglo[j] > aux) {
                arreglo[j + 1] = arreglo[j];
                j--;
            }
            arreglo[j + 1] = aux;
        }

        // <editor-fold desc="** Impresión del arreglo a pantalla **">
        System.out.println("\nArreglo Ordenado:");
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(" " + arreglo[i]);
        }
        System.out.println();
        // </editor-fold>
            }
            else if(opcion==3){
                int[] arreglo;
                System.out.println("¿Cuantos numeros quieres?");
                int numero= sc.nextInt();
                arreglo= new int[numero];
                System.out.println("Arreglo Original");
                for (int i = 0; i < arreglo.length; i++) {
                    arreglo[i] = (int) (Math.random() * 49 + 1);
                    System.out.print(" " + arreglo[i]);
                }
                System.out.println("");
                for (int i = 0; i < arreglo.length; i++) {
            int minimo = arreglo[i];
            int posicion = i;
            for (int j = i + 1; j < arreglo.length; j++) {
                if (arreglo[j] < minimo) {
                    minimo = arreglo[j];
                    posicion = j;
                }
            }
            if (posicion != i) {
                int aux = arreglo[i];
                arreglo[i] = arreglo[posicion];
                arreglo[posicion] = aux;
            }
        }
        // <editor-fold desc="** Impresión del arreglo a pantalla **">
        System.out.println("\nArreglo Ordenado:");
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(" " + arreglo[i]);
        }
        System.out.println();
        // </editor-fold>
            }
            else if(opcion==4){
                int[] arreglo;
                System.out.println("¿Cuantos numeros quieres?");
                int numero= sc.nextInt();
                arreglo= new int[numero];
                System.out.println("Arreglo Original");
                for (int i = 0; i < arreglo.length; i++) {
                    arreglo[i] = (int) (Math.random() * 49 + 1);
                    System.out.print(" " + arreglo[i]);
                }
                System.out.println("");
                Quicksort(arreglo, 0, numero - 1); 
                // <editor-fold desc="** Impresión del arreglo a pantalla **">
                System.out.print("\nArreglo Ordenado");
                System.out.println("");
                for(int i = 0; i < numero; i++){ 
                    // System.out.println();
                    System.out.print(" " + arreglo[i]);
                }
                System.out.println(); 
                // </editor-fold>
            }
        }
            catch (Exception e){
            System.out.println("Ingrese un numero valido entre las opciones, por favor");
}
        } while (opcion!=5);
    }
    static void Quicksort(int arr[], int p, int r)
    { 
if(p < r) 
{ 
int q = Particion(arr, p, r); 
Quicksort(arr, p, q - 1); 
Quicksort(arr, q + 1, r); 
} 
} 

static int Particion(int arr[], int p, int r){ 
int x = arr[r]; 
int i = p - 1, t; 
for(int j = p; j < r; j++) 
{ 
if(arr[j] <= x) 
{ 
i++; 
t = arr[i]; 
arr[i] = arr[j]; 
arr[j] = t; 
} 
} 
t = arr[i + 1]; 
arr[i + 1] = arr[r]; 
arr[r] = t; 
return i + 1; 
    }
}
