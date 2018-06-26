
package Ordenamiento;

/**
 *
 * @author Raymond
 */
public class BubbleSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     int[] arreglo = new int[20];
     int temporal;
     boolean intercambio;
     // Llenado del arreglo e Impresion
        System.out.println("Arreglo Original:");
        for (int i = 0; i <arreglo.length; i++) {
            arreglo[i]=(int)(Math.random()*49+1);
        }
          int cantidad = 0;
          do {
            intercambio = false;
              for (int i = 0; i <arreglo.length; i++) {
                  try {
                  if (arreglo[i]> arreglo[i+1]){
                      temporal = arreglo[i+1];
                      arreglo[i+1] = arreglo[i];
                      arreglo[i] = temporal;
                      intercambio = true;
                      //Impresion paso a paso
                      System.out.println(" ");
                      System.out.print(++cantidad+". ");
                      for (int j = 0; j < arreglo.length; j++) {
                          System.out.print(" " + arreglo[j]);
                      }
                      Thread.sleep(300);
                  }
                  }
                  catch(Exception e){
                  }
              }
        } while (intercambio==true);
          //Impresion del arreglo ya Ordenado
          System.out.println(" ");
          System.out.println("Arreglo Ordenado:"); 
        for (int i = 0; i <arreglo.length; i++) {
            System.out.print(" " + arreglo[i]);
        }
        System.out.println("");
    }
    
}
