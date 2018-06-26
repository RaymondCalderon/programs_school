/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordenamiento;

import java.util.Scanner;

/**
 *
 * @author Cesar
 */
public class AdivinaWho {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String respuesta;
        System.out.println("Juega Futbol?");
        respuesta = sc.nextLine();
        if("si".equals(respuesta)){
            System.out.println("Es hombre?");
            respuesta=sc.nextLine();
            if("si".equals(respuesta)){
                System.out.println("Tiene el pelo azul?");
                respuesta=sc.nextLine();
                if("si".equals(respuesta)){
                    System.out.println("Tu personaje es Julio");
                    System.exit(0);
                
                }
            }else if("no".equals(respuesta)){
                System.out.println("Es morena?");
                respuesta=sc.nextLine();
            
                if("si".equals(respuesta)){
                    System.out.println("Tu personaje es Laura");
                    System.exit(0);
                }else if("no".equals(respuesta)){
                
                    System.out.println("Tiene el pelo azul?");
                    respuesta=sc.nextLine();
                    if("si".equals(respuesta)){
                    System.out.println("Tu personaje es Lisa");
                    System.exit(0);
                    }else if("no".equals(respuesta)){
                        System.out.println("Tu personaje es Gil");
                        System.exit(0);
                    }
                }
            }
        
        }else if("no".equals(respuesta)){
            System.out.println("Juega basketball?");
             respuesta = sc.nextLine();
        if("si".equals(respuesta)){
            System.out.println("Es hombre?");
            respuesta=sc.nextLine();
             if("si".equals(respuesta)){
                  System.out.println("Es moreno?");
                respuesta=sc.nextLine();
                if("si".equals(respuesta)){
                    System.out.println("Tu personaje es Rogelio");
                    System.exit(0);
                }else{
                    System.out.println("Tiene pelo rubio?");
                    respuesta=sc.nextLine();
                    if("si".equals(respuesta)){
                    System.out.println("Tu personaje es Tono");
                    System.exit(0);
                }else{
                        System.out.println("Tu personaje es Rich");
                    System.exit(0);
                    }
                }
                 
             
        }else{
            System.out.println("Tiene pelo rubio?");
            respuesta = sc.nextLine();
             if("si".equals(respuesta)){
            System.out.println("Tu personaje es Beca");
            System.exit(0);
             }else{
                 System.out.println("Tu personaje es Fer");
                 System.exit(0);
             }
        }
         
    }else
            System.out.println("Juega Hookey?");
             respuesta = sc.nextLine();
        if("si".equals(respuesta)){
            System.out.println("Es moreno");
            respuesta = sc.nextLine();
            if("si".equals(respuesta)){
                System.out.println("Tu personaje es Oscar");
                System.exit(0);
            }else{
                System.out.println("Tu personaje es Zac");
                System.exit(0);
            }
            
            
        }else{
          System.out.println("Practica Sky?");
             respuesta = sc.nextLine();
        if("si".equals(respuesta)){
            System.out.println("Es hombre");
            respuesta = sc.nextLine();
            if("si".equals(respuesta)){
                System.out.println("Tu personaje es Pablo");
                System.exit(0);
            }else{
                System.out.println("Tiene pelo chino? ");
                 respuesta = sc.nextLine();
            if("si".equals(respuesta)){
                System.out.println("Tu personaje es Kati");
                System.exit(0);
            }else{
                System.out.println("Tu personaje es Holga");
                
            }  
            }  
        }else{
           System.out.println("Practica Tennis?");
             respuesta = sc.nextLine();
        if("si".equals(respuesta)){
            System.out.println("Es hombre");
            respuesta = sc.nextLine();
            if("si".equals(respuesta)){
                System.out.println("Tiene pelo rubio?");
                respuesta = sc.nextLine();
                if("si".equals(respuesta)){
                    System.out.println("Tu personaje es Paco");
                    System.exit(0);
                }else{
                    System.out.println("Tu personaje es Gary");
                    System.exit(0);
                }
            }else{
                System.out.println("Tu personaje es Erica");
            } 
        }else{
            System.out.println("Practica Golf?");
             respuesta = sc.nextLine();
        if("si".equals(respuesta)){
            System.out.println("Es hombre?");
            respuesta = sc.nextLine();
            if("si".equals(respuesta)){
                System.out.println("Tu personaje es Gary");
                System.exit(0);
            }else{
                System.out.println("Tiene el pelo azul?");
                respuesta = sc.nextLine();
                if("si".equals(respuesta)){
                    System.out.println("Tu personaje es Anisha");
                    System.exit(0);
                }else{
                    System.out.println("Tu personaje es Loren");
                    System.exit(0);
                }
            }
            
            
        }else{
            System.out.println("Practica Bolleyball?");
             respuesta = sc.nextLine();
        if("si".equals(respuesta)){
            System.out.println("Tu personaje es Gina");
            System.exit(0);
        }else{
            System.out.println("Practica Natacion?");
             respuesta = sc.nextLine();
        if("si".equals(respuesta)){
            System.out.println("Tu personaje es Pau");
            System.exit(0);
        }else{
          System.out.println("Practica Equitacion?");
             respuesta = sc.nextLine();
        if("si".equals(respuesta)){
            System.out.println("Tu personaje es Cori");
            System.exit(0);
        }else{
            System.out.println("No estas pensando en nadie Tramposo");
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
            
            
            
        
    

