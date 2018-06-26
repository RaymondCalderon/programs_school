
package Ordenamiento;

/**
 *
 * @author Raymond
 */
public class InsertionSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    int[] arreglo =new int[20];
    int aux;
    //Llenado del arreglo e Impresion de la misma
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
        //Impresion del arreglo Ordenado
        System.out.println(" ");
        System.out.println("Arreglo Ordenado:");
        for (int i = 0; i <arreglo.length; i++) {
            System.out.print(" " + arreglo[i]);
        }
        System.out.println("");
    }
    
}
