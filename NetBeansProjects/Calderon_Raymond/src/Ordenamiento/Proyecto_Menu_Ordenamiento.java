
package Ordenamiento;

import java.util.Scanner;

/**
 *
 * @author Raymond
 */
public class Proyecto_Menu_Ordenamiento {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Metodos de Ordenamiento");
        int opcion = 0;
        do{
        try{    
        
        System.out.println("Menu");
        Scanner t = new Scanner(System.in);
        System.out.println("1. Burbuja.");
        System.out.println("2. Inserción");
        System.out.println("3. Selección");
        System.out.println("4. QuickSort");
        System.out.println("5. Salida del Programa");
        System.out.print("Inserta un numero del menu para seleccionar la Opción Deseada: ");
        opcion=t.nextInt();
        //Algoritmo de Burbuja
        if (opcion==1) {
            System.out.println("Burbuja");
            System.out.println(" ");
            System.out.print("Cuantos numeros quieres Generar??:");
            t = new Scanner(System.in);
            int total =t.nextInt();
            int [] arreglo = new int[total];
            for (int i = 0; i <arreglo.length; i++) {
            arreglo[i]=(int)(Math.random()*49+1);
           }
            int cantidad = 0;
           int temporal;
           boolean intercambio;
            do{
            intercambio = false;
           
            for (int i = 0; i <arreglo.length; i++) {
                  try {
                  if (arreglo[i]> arreglo[i+1]){
                      temporal = arreglo[i+1];
                      arreglo[i+1] = arreglo[i];
                      arreglo[i] = temporal;
                      intercambio=true;
                      System.out.println(" ");
                      System.out.print(++cantidad+". ");
                      for (int j = 0; j < arreglo.length; j++) {
                          System.out.print(" " + arreglo[j]);
                      }
                      Thread.sleep(0);
                  }
             } 
             catch(Exception e){
              }
             }
            }while(intercambio==true);
        System.out.println("");   
        }
        else  if (opcion==2) {
            //Algoritmo de Insercion
            int aux;
            System.out.println("Insercion");
            System.out.println(" ");
            System.out.print("Cuantos numeros quieres Generar??:");
            t = new Scanner(System.in);
            int total =t.nextInt();
            int [] arreglo = new int[total];
            for (int i = 0; i <arreglo.length; i++) {
            arreglo[i]=(int)(Math.random()*49+1);
           }
             System.out.println("Arreglo Original:");
        for (int i = 0; i <arreglo.length; i++) {
            arreglo[i] = (int)(Math.random()*49+1);
            System.out.print(" " + arreglo[i]);
        }
        for (int i = 0; i <arreglo.length; i++) {
            aux=arreglo[i];
            int j = i-1;
            while(j>=0&&arreglo[j]>aux){
            arreglo[j+1] = arreglo[j];
            j--;
            }
            arreglo[j+1]=aux;
        }
        
        System.out.println(" ");
        System.out.println("Arreglo Ordenado:");
        for (int i = 0; i <arreglo.length; i++) {
            System.out.print(" " + arreglo[i]);
        }
        System.out.println("");
        }
        else if (opcion==3) {
            //Algoritmo de Seleccion
            System.out.println("Seleccion");
            System.out.println(" ");
            System.out.print("Cuantos numeros quieres Generar??:");
            t = new Scanner(System.in);
            int total =t.nextInt();
            int [] arreglo = new int[total];
            for (int i = 0; i <arreglo.length; i++) {
            arreglo[i]=(int)(Math.random()*49+1);
           }
        int con, puesto;
        System.out.println("Arreglo original:");
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = (int) (Math.random() * 49 + 1);
            System.out.print(" " + arreglo[i]);
        }
        for (int i = 0; i < arreglo.length; i++) {
            int minimo = arreglo[i];
            puesto = i;
            for (int j = i + 1; j < arreglo.length; j++) {
                if (arreglo[j] < minimo) {
                    minimo = arreglo[j];
                    puesto = j;
                }
            }
            if (puesto != i) {
                con = arreglo[i];
                arreglo[i] = arreglo[puesto];
                arreglo[puesto] = con;
            }
        }
        System.out.println(" ");
        System.out.println("Arreglo ordenado:");
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(" " + arreglo[i]);
        }
        System.out.println();
        }
        else if (opcion==4) {
            //Algoritmo de QuickSort
            System.out.println("QuickSort");
            System.out.println(" ");
            System.out.print("Cuantos numeros quieres Generar??:");
            t = new Scanner(System.in);
            int total =t.nextInt();
            int [] arreglo = new int[total];
            for (int i = 0; i <arreglo.length; i++) {
            arreglo[i]=(int)(Math.random()*49+1);
            }
             System.out.println("Arreglo Original");
                for (int i = 0; i < arreglo.length; i++) {
                    arreglo[i] = (int) (Math.random() * 49 + 1);
                    System.out.print(" " + arreglo[i]);
                }
                System.out.println("");
                Quicksort(arreglo, 0, total - 1); 
                // <editor-fold desc="** Impresión del arreglo a pantalla **">
                System.out.print("\nArreglo Ordenado");
                System.out.println("");
                for(int i = 0; i < total; i++){ 
                    // System.out.println();
                    System.out.print(" " + arreglo[i]);
                }
                System.out.println(); 
                // </editor-fold>
           }
            
        }catch(Exception e){
            System.out.println("Inserta una opcion Valida");
        }
      }while(opcion!=5);
    
 
    

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
