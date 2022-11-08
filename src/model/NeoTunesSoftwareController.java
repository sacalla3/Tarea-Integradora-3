package model;

import model.*;

import java.util.ArrayList;

import java.time.*;

public class NeoTunesSoftwareController{
    
    public NeoTunesSoftwareController(){
        
    }
    
    private String[] array_types_producers = {"Artistas", "Creadores de contenido"};
    
    private String[] array_types_users = {"Estandar", "Premium"};
    
    private String[] array_genders_songs = {"Rock", "Pop", "Trap", "House"};
    
    private String[] array_types_podcasts = {"Política", "Entretenimiento", "Videojuegos", "Moda"};
    
    private String[] array_types_audios = {"Canciones", "Podcast"};
    
    public String[] getArray_types_producers() {
        return array_types_producers;
    }
    
    public String[] getArray_types_audios(){
        return array_types_audios;
    }
    
    public String[] getArray_types_users(){
        return array_types_users;
    }
    
    public String[] getArray_genders_songs(){
        return array_genders_songs;
    }

    public String[] getArray_types_podcasts() {
        return array_types_podcasts;
    }
    
    
    
    //Array de artistas productores
    
    private ArrayList<ArtistProducerUsers> array_ArtistProducerUsers = new ArrayList<ArtistProducerUsers>();
    
    public ArtistProducerUsers createArtistProducerUser(String name, String url_image){
        
        //Generar usuario con la fecha actual
        LocalDateTime binding_date = LocalDateTime.now();
        
        array_ArtistProducerUsers.add(new ArtistProducerUsers(name, binding_date, url_image));
        
        return array_ArtistProducerUsers.get(array_ArtistProducerUsers.size() - 1);
    }

    public ArrayList<ArtistProducerUsers> getArray_ArtistProducerUsers() {
        return array_ArtistProducerUsers;
    }
    
    
    //Array creadores de contenido
    
    private ArrayList<ContentCreatorsProducerUsers> array_ContentCreatorsProducerUsers = new ArrayList<ContentCreatorsProducerUsers>();
    
    public ContentCreatorsProducerUsers createContentCreatorsProducerUser(String name, String url_image){
        
        //Generar usuario con la fecha actual
        LocalDateTime binding_date = LocalDateTime.now();
        
        array_ContentCreatorsProducerUsers.add(new ContentCreatorsProducerUsers(name, binding_date, url_image));
        
        return array_ContentCreatorsProducerUsers.get(array_ContentCreatorsProducerUsers.size() - 1);
    }

    public ArrayList<ContentCreatorsProducerUsers> getContentCreatorsProducerUsers() {
        return array_ContentCreatorsProducerUsers;
    }
    
    
    //Crear usuarios standard
    
    private ArrayList<StandardConsumerUser> array_StandardConsumerUser = new ArrayList<StandardConsumerUser>();
    
    public StandardConsumerUser createStandardConsumerUser(String nickname, int id_card){
        
        //Generar usuario con la fecha actual
        LocalDateTime bonding_date = LocalDateTime.now();
        
        array_StandardConsumerUser.add(new StandardConsumerUser(nickname, id_card, bonding_date));
        
        return array_StandardConsumerUser.get(array_StandardConsumerUser.size() - 1);
    }

    public ArrayList<StandardConsumerUser> getStandardConsumerUser() {
        return array_StandardConsumerUser;
    }
    
    //Crear usuarios premium
    
    private ArrayList<PremiumConsumerUser> array_PremiumConsumerUser = new ArrayList<PremiumConsumerUser>();
    
    public PremiumConsumerUser createPremiumConsumerUser(String nickname, int id_card){
        
        //Generar usuario con la fecha actual
        LocalDateTime bonding_date = LocalDateTime.now();
        
        array_PremiumConsumerUser.add(new PremiumConsumerUser(nickname, id_card, bonding_date));
        
        return array_PremiumConsumerUser.get(array_PremiumConsumerUser.size() - 1);
    }

    public ArrayList<PremiumConsumerUser> getPremiumConsumerUser() {
        return array_PremiumConsumerUser;
    }
    
    //Crear Canciones
    
    public Songs addSongToArtist(int artist, String name, String album, int gender, String url_cover, double duration, double price){
            
        //Añade la nueva cancion a la lista
        array_ArtistProducerUsers.get(artist).setIttemArray_songs(new Songs(name, album, array_genders_songs[gender], url_cover, duration, price));
        
        //ver el ultimo elemento del arreglo de canciones dentro del artista seleccionado;
        return array_ArtistProducerUsers.get(artist).getLatestArray_songs();
    }
    
    // Crear podcast
    
    public Podcast addPodcastToContentCreator(int content_creator, String name, String description, int category, String url_image, double duration){
            
        //Añade la nueva cancion a la lista
        array_ContentCreatorsProducerUsers.get(content_creator).setIttemArray_podcast(new Podcast(name, description, array_types_podcasts[category], url_image, duration));
        
        //ver el ultimo elemento del arreglo de canciones dentro del artista seleccionado;
        return array_ContentCreatorsProducerUsers.get(content_creator).getLatestArray_podcast();
    }
    
    // Crar Lista de reproduccion
    
    
    
    

}