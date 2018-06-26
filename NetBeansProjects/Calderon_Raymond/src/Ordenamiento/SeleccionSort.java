
package Ordenamiento;

/**
 *
 * @author Raymond
 */
public class SeleccionSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] arreglo = new int[10];
        int aux, posicion;

        System.out.println("Arreglo original:");
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = (int) (Math.random() * 49 + 1);
            System.out.print(" " + arreglo[i]);
        }

        for (int i = 0; i < arreglo.length; i++) {
            int minimo = arreglo[i];
            posicion = i;
            for (int j = i + 1; j < arreglo.length; j++) {
                if (arreglo[j] < minimo) {
                    minimo = arreglo[j];
                    posicion = j;
                }
            }
            if (posicion != i) {
                aux = arreglo[i];
                arreglo[i] = arreglo[posicion];
                arreglo[posicion] = aux;
            }
        }
        System.out.println(" ");
        System.out.println("Arreglo ordenado:");
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(" " + arreglo[i]);
        }
        System.out.println();
    
       }
    }
    

