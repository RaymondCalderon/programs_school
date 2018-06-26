/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ordenamiento;

import java.util.Scanner;

/**
 *
 * @author Cesar
 */
public class AdivinaChido {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String resp;
        Scanner sc = new Scanner(System.in);
        System.out.println("Practica futbol?");
        resp= sc.nextLine();
        if("si".equals(resp)){
            System.out.println("Tiene playera azul?");
             resp= sc.nextLine();
            if("si".equals(resp)){
            System.out.println("Tu personaje es Gil");
            System.exit(0);
            }else{
                System.out.println("Tiene playera amarilla?");
                resp= sc.nextLine();
                if("si".equals(resp)){
            System.out.println("Tu personaje es Lisa");
            System.exit(0);
            }else{
                    System.out.println("Tiene un numero?");
                    resp= sc.nextLine();
                    if("si".equals(resp)){
            System.out.println("Tu personaje es Roy");
            System.exit(0);
            }else{
                        System.out.println("Tiene pelo azul?");
                        resp=sc.nextLine();
                        if("si".equals(resp)){
            System.out.println("Tu personaje es Julio");
            System.exit(0);
            }else{
                            System.out.println("Tu personaje es Laura");
                        }
                    }
                }
            }
        }else{
            System.out.println("Practica Basquetball?");
            resp=sc.nextLine();
            if("si".equals(resp)){
            System.out.println("Tiene pelo rubio?");
            resp=sc.nextLine();
            if("si".equals(resp)){
            System.out.println("Tiene un numero?");
            resp=sc.nextLine();
            if("si".equals(resp)){
            System.out.println("Tu personaje es Toño");
            System.exit(0);
            }else{
                System.out.println("Tu personaje es Beca");
                System.exit(0);
            }
            }else{
                System.out.println("Tiene playera Blanca?");
                resp=sc.nextLine();
                if("si".equals(resp)){
            System.out.println("Tu personaje es Fer");
            System.exit(0);
            }else{
                    System.out.println("Tiene un numero?");
                    resp=sc.nextLine();
                    if("si".equals(resp)){
            System.out.println("Tu personaje es Rich");
            System.exit(0);
            }else{
                        System.out.println("Tu personaje es Rogelio");
                    }
                }
            }
            }else{
                System.out.println("Practica Golf?");
                resp=sc.nextLine();
                if("si".equals(resp)){
            System.out.println("Es hombre?");
            resp=sc.nextLine();
            if("si".equals(resp)){
            System.out.println("Tu personaje es Alonso");
            System.exit(0);
            }else{
                System.out.println("Tiene cabello azul?");
                resp=sc.nextLine();
                if("si".equals(resp)){
            System.out.println("Tu personaje es Anisha");
            System.exit(0);
            }else{
                    System.out.println("Tu personaje es Loren");
                    System.exit(0);
                }
            }
            }else{
                    System.out.println("Practica Tennis?");
                    resp=sc.nextLine();
                    if("si".equals(resp)){
            System.out.println("Tiene Visera");
            resp=sc.nextLine();
            if("si".equals(resp)){
            System.out.println("Tu personaje es Erica");
            System.exit(0);
            }else{
                System.out.println("Tiene playera Rosa?");
                resp=sc.nextLine();
                if("si".equals(resp)){
            System.out.println("Tu personaje es Paco");
            System.exit(0);
            }else{
                    System.out.println("Tu personaje es Gary");
                    System.exit(0);
                }
            }
            }else{
                        System.out.println("Practica Sky?");
                        resp=sc.nextLine();
                        if("si".equals(resp)){
            System.out.println("Es hombre?");
            resp=sc.nextLine();
            if("si".equals(resp)){
            System.out.println("Tu personaje es Pablo");
            System.exit(0);
            }else{
                System.out.println("Tiene gorro azul?");
                resp=sc.nextLine();
                if("si".equals(resp)){
            System.out.println("Tu personaje es Olga");
            System.exit(0);
            }else{
                    System.out.println("Tu personaje es Kati");
                    System.exit(0);
                }
            }
            }else{
                            System.out.println("Juega Hokey?");
                            resp=sc.nextLine();
                            if("si".equals(resp)){
            System.out.println("Tiene casco?");
            resp=sc.nextLine();
            if("si".equals(resp)){
            System.out.println("Tu personaje es Zac");
            System.exit(0);
            }else{
                System.out.println("Tu personaje es Oscar");
                System.exit(0);
            }
            }else{
                                System.out.println("Juega Volleyball?");
                                resp=sc.nextLine();
                                if("si".equals(resp)){
            System.out.println("Tu personaje es Gina");
            System.exit(0);
            }else{
                                    System.out.println("Practica Natacion?");
                                    resp=sc.nextLine();
                                    if("si".equals(resp)){
            System.out.println("Tu personaje es Pau");
            System.exit(0);
            }else{
             System.out.println("Tu personaje es Cori");
            System.exit(0);                           
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
    
}
