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
                    
                    System.out.println("\n Registrar canciones y podcasts.....");
                    
                    //Seleccionar tipo de audio a crear
                    
                    for(int i = 0; i < controller.getArray_types_audios().length; i++){
                        System.out.println("\n [" + i + "] " + controller.getArray_types_audios()[i]);
                    }
                    
                    int type_audio = sc.nextInt();
                    
                    
                    //Comprueba si el array esta vacio
                    
                        if(type_audio == 0){
                            
                            //Comprueba si el array esta vacio
                            if(controller.getArray_ArtistProducerUsers().isEmpty()){
                                System.out.println("\n No se han encontrado elementos");
                            }else{

                                //Seleccionar un artista existente

                                System.out.println("\n Seleccione el Artista.....");

                                for(int i = 0; i < controller.getArray_ArtistProducerUsers().size(); i++){
                                    System.out.println("\n [" + i + "] " + controller.getArray_ArtistProducerUsers().get(i));
                                }

                                int artist = sc.nextInt();

                                System.out.println("\n Nombre:");
                                sc.nextLine();
                                String name = sc.nextLine();

                                System.out.println("\n Album:");
                                String album = sc.nextLine();

                                System.out.println("\n URL de la imagen representativa:");
                                String url_cover = sc.nextLine();

                                System.out.println("\n Genero:");

                                //Mostrar generos

                                for(int i = 0; i < controller.getArray_genders_songs().length; i++){
                                    System.out.println("\n [" + i + "] " + controller.getArray_genders_songs()[i]);
                                }

                                int gender = sc.nextInt();

                                System.out.println("\n Duracion:");
                                double duration = sc.nextDouble();

                                System.out.println("\n Precio:");
                                double price = sc.nextDouble();

                                Songs element_created = controller.addSongToArtist(artist, name, album, gender, url_cover, duration, price);

                                System.out.println("\n Usuario creado satisfacoriamente: \n" + element_created);
                            
                            }

                        }else{
                            
                            if(controller.getContentCreatorsProducerUsers().isEmpty()){
                        
                                System.out.println("\n No se han encontrado elementos ");
                        
                            }else{

                                System.out.println("\n Seleccione el Creador de contenido.....");

                                for(int i = 0; i < controller.getContentCreatorsProducerUsers().size(); i++){
                                    System.out.println("\n [" + i + "] " + controller.getContentCreatorsProducerUsers().get(i));
                                }

                                int content_creator = sc.nextInt();

                                System.out.println("\n Nombre:");
                                sc.nextLine();
                                String name = sc.nextLine();

                                System.out.println("\n Descripcion:");
                                String description = sc.nextLine();

                                System.out.println("\n URL de la imagen representativa:");
                                String url_image = sc.nextLine();

                                System.out.println("\n Categoria:");

                                //Mostrar generos

                                for(int i = 0; i < controller.getArray_types_podcasts().length; i++){
                                    System.out.println("\n [" + i + "] " + controller.getArray_types_podcasts()[i]);
                                }

                                int category = sc.nextInt();

                                System.out.println("\n Duracion:");
                                double duration = sc.nextDouble();

                                Podcast element_created = controller.addPodcastToContentCreator(content_creator, name, description, category, url_image, duration);

                                System.out.println("\n Usuario creado satisfacoriamente: \n" + element_created);

                            }
                        }
                    
                    
                    System.out.println("\n Presione enter para continuar.............");
                        sc.nextLine();
                        sc.nextLine();
                    
                    lp.clean();

                    break;
                }

                case 4:{
                    
                    System.out.println("\n Crear Lista de reproducción.....");
                    
                    //Seleccionar un tipo de usuario
                    
                    System.out.println("\n Seleccione un tipo de usuario.....");
                    
                    for(int i = 0; i < controller.getArray_types_users().length; i++){
                        System.out.println("\n [" + i + "] " + controller.getArray_types_users()[i]);
                    }
                    
                    int type_user = sc.nextInt();
                    
                    
                    
                    //Usuarios estandard
                    if(type_user == 0){
                        
                        for(int i = 0; i < controller.getStandardConsumerUser().size(); i++){
                            System.out.println("\n [" + i + "] " + controller.getStandardConsumerUser().get(i));
                        }

                        int usuario = sc.nextInt();
                        
                        
                        //Nombre de la lista de reproduccion
                        
                        System.out.println("\n Ingrese el nombre de la lista de reproduccion: ");
                        
                        sc.nextLine();
                        String name = sc.nextLine();
                        
                        controller.getStandardConsumerUser().get(usuario).createPlaylist(name);
                        
                        
                        
                        //Seleccionar productor y audio:
                        
                        boolean startPetitionAudio = true;
                        
                        while(startPetitionAudio){
                            
                            
                            //Seleccionar un productor
                            
                            System.out.println("\n Seleccione un tipo de productor: ");
                            
                            for(int i = 0; i < controller.getArray_types_producers().length; i++){
                                System.out.println("\n [" + i + "] " + controller.getArray_types_producers()[i]);
                            }
                            
                            System.out.println("[\n [2] Guardar y salir");
                            
                            int type_productor = sc.nextInt();
                        
                            
                            switch(type_productor){
                                case 0:{
                                    
                                    //Seleccionar un artista
                                    
                                    System.out.println("\n Seleccione un artista para ver su catalogo: ");
                                    
                                    for(int i = 0; i < controller.getArray_ArtistProducerUsers().size(); i++){
                                        System.out.println("\n [" + i + "] " + controller.getArray_ArtistProducerUsers().get(i));
                                    }
                                    
                                    int artista = sc.nextInt();
                                    
                                    
                                    //Seleccionar una cancion del artista
                                    
                                    
                                    System.out.println("\n Seleccione una cancion: ");
                                    
                                    for(int i = 0; i < controller.getArray_ArtistProducerUsers().get(artista).getArray_songs().size(); i++){
                                        System.out.println("\n [" + i + "] " + controller.getArray_ArtistProducerUsers().get(artista).getArray_songs().get(i));
                                    }
                                    
                                    Songs cancion = controller.getArray_ArtistProducerUsers().get(artista).getArray_songs().get(sc.nextInt());
                                    
                                    //posicion de la playlist actual
                                    int playlist = controller.getStandardConsumerUser().get(usuario).getArray_playlist().size() - 1;
                                    
                                    
                                    controller.getStandardConsumerUser().get(usuario).addSongToPlaylist(cancion, playlist);
                                            
                                    System.out.println("\n Cancion agregada: \n " + controller.getStandardConsumerUser().get(usuario).getArray_playlist());
                                    
                                    break;
                                }
                                
                                case 1:{
                                    
                                    
                                    //Seleccionar un Creador de contenido
                                    
                                    System.out.println("\n Seleccione un artista para ver su catalogo: ");
                                    
                                    for(int i = 0; i < controller.getContentCreatorsProducerUsers().size(); i++){
                                        System.out.println("\n [" + i + "] " + controller.getContentCreatorsProducerUsers().get(i));
                                    }
                                    
                                    int content_creator = sc.nextInt();
                                    
                                    
                                    //Seleccionar una cancion del artista
                                    
                                    
                                    System.out.println("\n Seleccione un Podcast: ");
                                    
                                    for(int i = 0; i < controller.getContentCreatorsProducerUsers().get(content_creator).getArray_podcast().size(); i++){
                                        System.out.println("\n [" + i + "] " + controller.getContentCreatorsProducerUsers().get(content_creator).getArray_podcast().get(i));
                                    }
                                    
                                    Podcast podcast = controller.getContentCreatorsProducerUsers().get(content_creator).getArray_podcast().get(sc.nextInt());
                                    
                                    //posicion de la playlist actual
                                    int playlist = controller.getStandardConsumerUser().get(usuario).getArray_playlist().size() - 1;
                                    
                                    
                                    controller.getStandardConsumerUser().get(usuario).addPodcastToPlaylist(podcast, playlist);
                                            
                                    System.out.println("\n Cancion agregada: \n " + controller.getStandardConsumerUser().get(usuario).getArray_playlist());
                                    
                                    break;
                                }
                                
                                case 2:{
                                    startPetitionAudio = false;
                                    break;
                                }
                                
                                default:{
                                    startPetitionAudio = false;
                                    break;
                                }
                            }
                        }
                        
                    
                    }

                    //Usuario premium
                    else{
                        
                        for(int i = 0; i < controller.getPremiumConsumerUser().size(); i++){
                            System.out.println("\n [" + i + "] " + controller.getPremiumConsumerUser().get(i));
                        }

                        int usuario = sc.nextInt();
                        
                        
                        //Nombre de la lista de reproduccion
                        
                        System.out.println("\n Ingrese el nombre de la lista de reproduccion: ");
                        
                        sc.nextLine();
                        String name = sc.nextLine();
                        
                        controller.getPremiumConsumerUser().get(usuario).createPlaylist(name);
                        
                        
                        
                        //Seleccionar productor y audio:
                        
                        boolean startPetitionAudio = true;
                        
                        while(startPetitionAudio){
                            
                            
                            //Seleccionar un productor
                            
                            System.out.println("\n Seleccione un tipo de productor: ");
                            
                            for(int i = 0; i < controller.getArray_types_producers().length; i++){
                                System.out.println("\n [" + i + "] " + controller.getArray_types_producers()[i]);
                            }
                            
                            System.out.println("[\n [2] Guardar y salir");
                            
                            int type_productor = sc.nextInt();
                        
                            
                            switch(type_productor){
                                case 0:{
                                    
                                    //Seleccionar un artista
                                    
                                    System.out.println("\n Seleccione un artista para ver su catalogo: ");
                                    
                                    for(int i = 0; i < controller.getArray_ArtistProducerUsers().size(); i++){
                                        System.out.println("\n [" + i + "] " + controller.getArray_ArtistProducerUsers().get(i));
                                    }
                                    
                                    int artista = sc.nextInt();
                                    
                                    
                                    //Seleccionar una cancion del artista
                                    
                                    
                                    System.out.println("\n Seleccione una cancion: ");
                                    
                                    for(int i = 0; i < controller.getArray_ArtistProducerUsers().get(artista).getArray_songs().size(); i++){
                                        System.out.println("\n [" + i + "] " + controller.getArray_ArtistProducerUsers().get(artista).getArray_songs().get(i));
                                    }
                                    
                                    Songs cancion = controller.getArray_ArtistProducerUsers().get(artista).getArray_songs().get(sc.nextInt());
                                    
                                    //posicion de la playlist actual
                                    int playlist = controller.getPremiumConsumerUser().get(usuario).getArray_playlist().size() - 1;
                                    
                                    
                                    controller.getPremiumConsumerUser().get(usuario).addSongToPlaylist(cancion, playlist);
                                            
                                    System.out.println("\n Cancion agregada: \n " + controller.getPremiumConsumerUser().get(usuario).getArray_playlist());
                                    
                                    break;
                                }
                                
                                case 1:{
                                    
                                    
                                    //Seleccionar un Creador de contenido
                                    
                                    System.out.println("\n Seleccione un artista para ver su catalogo: ");
                                    
                                    for(int i = 0; i < controller.getContentCreatorsProducerUsers().size(); i++){
                                        System.out.println("\n [" + i + "] " + controller.getContentCreatorsProducerUsers().get(i));
                                    }
                                    
                                    int content_creator = sc.nextInt();
                                    
                                    
                                    //Seleccionar una cancion del artista
                                    
                                    
                                    System.out.println("\n Seleccione un Podcast: ");
                                    
                                    for(int i = 0; i < controller.getContentCreatorsProducerUsers().get(content_creator).getArray_podcast().size(); i++){
                                        System.out.println("\n [" + i + "] " + controller.getContentCreatorsProducerUsers().get(content_creator).getArray_podcast().get(i));
                                    }
                                    
                                    Podcast podcast = controller.getContentCreatorsProducerUsers().get(content_creator).getArray_podcast().get(sc.nextInt());
                                    
                                    //posicion de la playlist actual
                                    int playlist = controller.getPremiumConsumerUser().get(usuario).getArray_playlist().size() - 1;
                                    
                                    
                                    controller.getPremiumConsumerUser().get(usuario).addPodcastToPlaylist(podcast, playlist);
                                            
                                    System.out.println("\n Cancion agregada: \n " + controller.getPremiumConsumerUser().get(usuario).getArray_playlist());
                                    
                                    break;
                                }
                                
                                case 2:{
                                    startPetitionAudio = false;
                                    break;
                                }
                                
                                default:{
                                    startPetitionAudio = false;
                                    break;
                                }
                            }
                        }
                        
                    
                    }
                    
                    
                   
                    
                    

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