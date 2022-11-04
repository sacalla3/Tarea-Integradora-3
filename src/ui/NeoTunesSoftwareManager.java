package ui;

import java.util.Scanner;

import model.*;

public class NeoTunesSoftwareManager{

    private Scanner sc;
    private NeoTunesSoftwareController NTSController;
    private ClearConsole lp;

    public NeoTunesSoftwareManager(){
        sc = new Scanner(System.in);
        NTSController = new NeoTunesSoftwareController(); 
        lp = new ClearConsole(); 
    }

    public static void main(String args[]){
        NeoTunesSoftwareManager NTSManager = new NeoTunesSoftwareManager();
        NTSManager.showMenu();
    }

    public void showMenu(){
        
        lp.clean();
        
        Boolean startMenu = true;

        while(startMenu){

            System.out.println("""

            Bienvenido a NeoTunes Software
            
            Seleccione una opcion........

            [1] Registrar usuarios productores, artistas y creadores de contenido.
            [2] Registrar usuarios consumidores, estándar y premium.
            [3] Registrar canciones y podcasts.
            [4] Crear una lista de reproducción.
            [5] Editar una lista de reproducción.
            [10] Salir del programa.
            
            """);

            int option = sc.nextInt();

            switch(option){

                case 1:{

                    lp.clean();

                    System.out.println("\n Registrar usuarios productores, artistas y creadores de contenido.....");

                    sc.nextInt();

                    lp.clean();
                    break;
                }

                case 2:{

                    break;
                }

                case 3:{

                    break;
                }

                case 4:{

                    break;
                }

                case 5:{

                    break;
                }

                case 10:{


                    startMenu = false;

                    System.out.println("""

                    Closing......
                    Closing....................
                    Closing..................................
                    """);

                    break;
                }

            }

        }
    }

}