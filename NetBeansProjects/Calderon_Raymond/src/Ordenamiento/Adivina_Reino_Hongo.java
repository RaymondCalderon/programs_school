/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ordenamiento;

import java.util.Scanner;

/**
 *
 * @author Angel
 */
public class Adivina_Reino_Hongo {
public static void main(String[] args) {
    MK2 abrir = new MK2();
    abrir.setVisible(true);
  Scanner sc = new Scanner(System.in);
    System.out.println("Adivina quien - Reino Hongo");
    String aw1 = "si";
  //  String aw0 = "no";
    String resp;
    System.out.println("¿Su personaje es humano? (toad y toadette son humanos)");
    resp = sc.nextLine();
    if (resp.equals(aw1)){
       System.out.println("¿Su personaje tiene rojo?");
         resp = sc.nextLine();
       if(resp.equals(aw1)){
           System.out.println("¿Su personaje tiene blanco?(los ojos y dientes no cuentan)");
             resp = sc.nextLine();
           if(resp.equals(aw1)){
             System.out.println("¿Su personaje es un fontanero?");
               resp = sc.nextLine();
                    if(resp.equals(aw1)){
                      System.out.println("Su personaje es Mario");           
                    }else{
                      System.out.println("Su personaje es Toad");
                    }
//SI HUMANO SI ROJO NO BLANCO                          
                    }else{
               System.out.println("¿Su personaje tiene una corona plateada?");
               resp = sc.nextLine();
               if(resp.equals(aw1)){
                   System.out.println("Su personaje es Rosalina");
               }else{
                   System.out.println("Su personaje es Peach");
               }
           }
//SI HUMANO NO ROJO                
           }else{
         System.out.println("¿Su personaje es hombre (Toadette es mujer)?");
                 resp = sc.nextLine();
                 if(resp.equals(aw1)){
                     System.out.println("¿Su personaje usa una "+"L"+" en su gorra?");
                     resp = sc.nextLine();
                 if(resp.equals(aw1)){
                     System.out.println("Su personaje es Luigi");
                 }else{
                     System.out.println("¿Su personaje tiene una W en su gorra?");
                     resp = sc.nextLine();
                 if(resp.equals(aw1)){
                     System.out.println("Su personaje es Wario");
                 }else{
                     System.out.println("Su personaje es Waluigi");
                 }
                 }
                 }else{
                     System.out.println("¿Su personaje tiene el cabello cafe?");
                       resp = sc.nextLine();
                       if(resp.equals(aw1)){
                           System.out.println("Su personaje es Daisy");
                       }else{
                           System.out.println("Su personaje es Toadette");
                       }
                 }
           }
//NO HUMANOS--------------------------------------------------------------------
       }else{
           
        
//SI ROJO-----------------------------------------------------------------------
           System.out.println("¿Su personaje tiene rojo?");
         resp = sc.nextLine();
            if(resp.equals(aw1)){
System.out.println("¿Su personaje tiene blanco?(los ojos y dientes no cuentan)");
            resp = sc.nextLine();
            if(resp.equals(aw1)){
                System.out.println("¿Su personaje tiene nariz?");
                 resp = sc.nextLine();
                 if(resp.equals(aw1)){
                     System.out.println("¿Su personaje tiene cejas?");
                      resp = sc.nextLine();
                      if(resp.equals(aw1)){
                          System.out.println("Su personaje es Bowser Jr");
                      }else{
                          System.out.println("Su personaje es Yoshi");
                      }
                 }else{
                     System.out.println("¿Su peronsaje es una planta?");
                      resp = sc.nextLine();
                      if(resp.equals(aw1)){
                          System.out.println("Su personaje es Piranha Plant");
                      }else{
                          System.out.println("Su personaje es Shy Guy");
                      }
                 }
//SI ROJO NO BLANCO-------------------------------------------------------------
            }else{
                System.out.println("¿Su personaje tiene rosa?");
                      resp = sc.nextLine();
                      if(resp.equals(aw1)){
                          System.out.println("Su personaje es Birdo");
                      }else{
                            System.out.println("¿Su personaje es un mono?");
                      resp = sc.nextLine();
                      if(resp.equals(aw1)){
                          System.out.println("Su personaje es Diddy Kong");
                      }else{
                          System.out.println("Su personaje es Bowser");
                      }
                      }
            }
//NO ROJO-----------------------------------------------------------------------
       }else{
                 System.out.println("¿Su personaje tiene blanco?(los ojos y dientes no cuentan)");
                 resp = sc.nextLine();
                 if(resp.equals(aw1)){
//NO ROJO SI BLANCO-------------------------------------------------------------
                         System.out.println("¿Su personaje tiene un casco o gorro?");
                          resp = sc.nextLine();
                          if(resp.equals(aw1)){
                              System.out.println("¿Su personaje usa lentes?");
                              resp = sc.nextLine();
                              if(resp.equals(aw1)){
                                  System.out.println("Su personaje es Kammy Koopa");
                              }else{
                                  System.out.println("Su personaje es Hammer bro");
                          }
                          }else{
                              System.out.println("¿Su personaje es un fantasma?");
                              resp = sc.nextLine();
                              if(resp.equals(aw1)){
                                  System.out.println("Su personaje es Boo");
                              }else{
                                  System.out.println("¿Su personaje parece un calamar?");
                                  resp = sc.nextLine();
                                  if(resp.equals(aw1)){
                                      System.out.println("Su personaje es Blooper");
                                  }else{
                                      System.out.println("Su personaje es Dry Bones");
                                  }
                              }
                          }
             
                 }else{
//NO ROJO NO BLANCO--------------------------------------------------------------
                         System.out.println("¿Su personaje es cafe?");
                             resp = sc.nextLine();
                             if(resp.equals(aw1)){
                                 System.out.println("¿Su personaje es un gorila?");
                                   resp = sc.nextLine();
                                   if(resp.equals(aw1)){
                                       System.out.println("Su personaje es Donkey Kong");
                                   }else{
                                       System.out.println("Su personaje es Goomba");
                                   }
                             }else{
                                 System.out.println("Su personaje es Koopa Troopa");
                             }
                 }
            }
  
}
    System.out.println("Gracias por jugar");
    System.exit(0);
}
}