/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareas;

import java.util.Random;

/**
 *
 * @author alumnounipoli
 */
public class Generar_Dos_Numeros {
       public static final void main(String args[]){
        Random rdm = new Random();
        int numeroAleatorio1 ;
 
               int numeroAleatorio2 = 11;          
          
            numeroAleatorio1 =  (rdm.nextInt(10) + 1);
         numeroAleatorio2 =  (rdm.nextInt(20) + 1);
           System.out.println("numeros generados:" +numeroAleatorio1);
              System.out.println("numeros generados:"+ numeroAleatorio2);
       int total = numeroAleatorio1+numeroAleatorio2;
     while (numeroAleatorio1 != numeroAleatorio2){


         System.out.println(numeroAleatorio1++);
     
       }
           
           System.out.println("la suma es: "+ total);
       }
       
}
