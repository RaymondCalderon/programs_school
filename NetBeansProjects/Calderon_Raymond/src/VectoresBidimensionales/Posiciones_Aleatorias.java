
package VectoresBidimensionales;

/**
 *
 * @author Raymond
 */
public class Posiciones_Aleatorias {

    public static void main(String[] args) {
    String [][] arreglo = new String [5][5]; 
    int a, b;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                arreglo[i][j] = "-" ;
            }
        }
        for (int i = 0; i < 10 ; i++) {
            a = (int)(Math.random()*5);
            b = (int)(Math.random()*5);
            if ("-".equals(arreglo[a][b])){
           arreglo[a][b] = "x";
         
          }else{
                i--;
            }
        }
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(arreglo[i][j] + " ");
                
            }
            System.out.println(" ");
        }
        
    }
    
}
