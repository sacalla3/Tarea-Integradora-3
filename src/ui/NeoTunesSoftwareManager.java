package ui;

import java.util.Scanner;

import model.*;

public class NeoTunesSoftwareManager{

    private Scanner sc;
    private NeoTunesSoftwareController controller;
    private ClearConsole lp;

    public NeoTunesSoftwareManager(){
        sc = new Scanner(System.in);
        controller = new NeoTunesSoftwareController(); 
        lp = new ClearConsole(); 
    }

    public static void main(String args[]){
        NeoTunesSoftwareManager manager = new NeoTunesSoftwareManager();
        manager.showMenu();
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
                    
                    //Imprimir los tipos usuarios productores
                    for(int i = 0; i < controller.getArray_types_producers().length; i++){
                        System.out.println("\n [" + i + "] " + controller.getArray_types_producers()[i]);
                    }
                    
                    int type_producer = sc.nextInt();
                    
                    System.out.println("\n Ingrese el nombre: ");
                    sc.nextLine();
                    String name = sc.nextLine();
                    
                    System.out.println("\n Ingrese la URL de la imagen distintiva: ");
                    String url_image = sc.nextLine();
                    
                    if(type_producer == 0){
                        
                        ArtistProducerUsers element_created = controller.createArtistProducerUser(name, url_image);
                        System.out.println("\n Usuario creado satisfacoriamente: \n" + element_created);
                       
                    }else{
                        ContentCreatorsProducerUsers element_created = controller.createContentCreatorsProducerUser(name, url_image);
                        System.out.println("\n Usuario creado satisfacoriamente: \n" + element_created);
                       
                    }
                    
                    System.out.println("\n \n Presione Enter para continuar........");
                    sc.nextLine();
                    
                    lp.clean();
                    break;
                }

                case 2:{
                    
                    System.out.println("\n Registrar usuarios consumidores, estándar y premium.....");
                    
                    for(int i = 0; i < controller.getArray_types_users().length; i++){
                        System.out.println("\n [" + i + "] " + controller.getArray_types_users()[i]);
                    }
                    
                    int type_user = sc.nextInt();
                    
                    System.out.println("\n Ingrese el nickname: ");
                    sc.nextLine();
                    String nickname = sc.nextLine();
                    
                    System.out.println("\n Ingrese la cedula: ");
                    int id_card = sc.nextInt();
                    
                    if(type_user == 0){
                        StandardConsumerUser element_created = controller.createStandardConsumerUser(nickname, id_card);
                        System.out.println("\n Usuario creado satisfacoriamente: \n" + element_created);
                       
                    }else{
                        PremiumConsumerUser element_created = controller.createPremiumConsumerUser(nickname, id_card);
                        System.out.println("\n Usuario creado satisfacoriamente: \n" + element_created);
                       
                    }
                    
                    System.out.println("\n \n Presione Enter para continuar........");
                    sc.nextLine();
                    sc.nextLine();
                    
                    lp.clean();
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