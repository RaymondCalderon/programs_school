package Vectores;

/**
 *
 * @author Raymond
 */
public class Ejercicio1Arreglos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    int [] arreglo1 = new int [5];
    int [] arreglo2 = new int [5];
    int [] arreglo3 = new int [5];
      
        for(int i=0; i<arreglo1.length; i++)
            {
            arreglo1[i] = (int)(Math.random()*20+1);
            arreglo2[i] = (int)(Math.random()*20+1);
            arreglo3[i] = arreglo1[i]*arreglo2[i];
            System.out.println(arreglo1[i] + "x" + arreglo2[i] + "="+ arreglo3[i] );
            }
    }
    
  }

