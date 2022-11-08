/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.time.LocalDateTime;

import java.util.ArrayList;

/**
 *
 * @author sacal
 */
public class ContentCreatorsProducerUsers extends ProducerUsers {
    
    ArrayList<Podcast> array_podcast = new ArrayList<Podcast>();

    public ArrayList<Podcast> getArray_podcast() {
        return array_podcast;
    }

    public void setArray_podcast(ArrayList<Podcast> array_podcast) {
        this.array_podcast = array_podcast;
    }
    
    public Podcast getLatestArray_podcast() {
        return array_podcast.get(array_podcast.size()-1);
    }
    
    public void setIttemArray_podcast(Podcast podcast) {
        this.array_podcast.add(podcast);
    }
    
    
    
    public ContentCreatorsProducerUsers(String name, LocalDateTime binding_date, String url_image){
        super(name, binding_date, url_image);
    }
    
}
