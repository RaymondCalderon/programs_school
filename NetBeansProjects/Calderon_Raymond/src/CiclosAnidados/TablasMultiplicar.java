package CiclosAnidados;

import java.util.Scanner;

/**
 *
 * @author Raymond
 */
public class TablasMultiplicar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        Scanner t = new Scanner(System.in);
        System.out.println("En cual tabla Empieza ??");
        int inicio = t.nextInt();
        System.out.println("En cual tabla Termina ??");
        int fin = t.nextInt();
        
      for(int num = inicio; num<=fin; num++)
      {
        for(int i = 1; i<=10; i++)
        {
            System.out.println(num + "x"+ i + "=" + num*i);
            Thread.sleep(100);
        }
          System.out.println("  ");
      
      }
    }

}
