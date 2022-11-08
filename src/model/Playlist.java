/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author sacal
 */
public class Playlist {
    private String name;
    private ArrayList<Songs> list_songs = new ArrayList<Songs>();
    private ArrayList<Podcast> list_podcast = new ArrayList<Podcast>();
    private int id;

    public Playlist(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    
    public ArrayList<Songs> getList_songs() {
        return list_songs;
    }
    
    public Songs getLastestList_songs() {
        return list_songs.get(list_songs.size() - 1);
    }

    public void setList_songs(ArrayList<Songs> list_songs) {
        this.list_songs = list_songs;
    }
    
    public void setIttemList_songs(Songs song) {
        this.list_songs.add(song);
    }

    

    public ArrayList<Podcast> getList_podcast() {
        return list_podcast;
    }
    
    public Podcast getLastestList_podcast() {
        return list_podcast.get(list_podcast.size() - 1);
    }

    public void setList_podcast(ArrayList<Podcast> list_podcast) {
        this.list_podcast = list_podcast;
    }
    
    public void setIttemList_podcast(Podcast podcast) {
        this.list_podcast.add(podcast);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "name=" + name + ", list_songs=" + list_songs + ", list_podcast=" + list_podcast + ", id=" + id;
    }

}
