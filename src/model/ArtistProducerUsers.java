/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.time.*;

import java.util.ArrayList;


/**
 *
 * @author sacal
 */
public class ArtistProducerUsers extends ProducerUsers {
    
        private ArrayList<Songs> array_songs = new ArrayList<Songs>();

    /**
     * Get the value of array_songs
     *
     * @return the value of array_songs
     */
    public ArrayList<Songs> getArray_songs() {
        return array_songs;
    }

    public Songs getLatestArray_songs(){
        return array_songs.get( array_songs.size()-1 );
    }
    /**
     * Set the value of array_songs
     *
     * @param array_songs new value of array_songs
     */
    public void setArray_songs(ArrayList<Songs> array_songs) {
        this.array_songs = array_songs;
    }
    
    public void setIttemArray_songs(Songs song){
        this.array_songs.add(song);
    }
    

    
    public ArtistProducerUsers(String name, LocalDateTime binding_date, String url_image){
        super(name, binding_date, url_image);
    }
    
}
