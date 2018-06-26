
package VectoresBidimensionales;

/**
 *
 * @author Raymond
 */
public class Arreglo8x8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int arreglo [][] = new int [8][8];
        
        for (int i = 0; i < 8 ; i++) {
            for (int j = 0; j < 8; j++) {
                arreglo [i][j] =(int)(Math.random()*89+10);
            }   
        }
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print(arreglo[i][j] + " ");  
            }
            System.out.println();
        }
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
               
                if(arreglo[i][j]%2==0){
                
                    System.out.println("Par en ["+i+"]["+j+"]");
                }
                
            }
        }
    }
    
}
