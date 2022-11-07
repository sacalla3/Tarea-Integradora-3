package model;

import model.*;

import java.util.ArrayList;

import java.time.*;

public class NeoTunesSoftwareController{
    
    public NeoTunesSoftwareController(){
        
    }
    
    private String[] array_types_producers = {"Artistas", "Creadores de contenido"};
    
    private String[] array_types_users = {"Estandar", "Premium"};
    
    public String[] getArray_types_producers() {
        return array_types_producers;
    }
    
    public String[] getArray_types_users(){
        return array_types_users;
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
    
    
    

}