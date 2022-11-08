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

public class StandardConsumerUser extends ConsumerUser{
    
    ArrayList<Playlist> array_playlist = new ArrayList<Playlist>();
    
    public StandardConsumerUser(String nickname, int id_card, LocalDateTime bonding_date){
        super(nickname, id_card, bonding_date);
        
        this.setCatalog_access(true);
        this.setNum_playlists(20);
        this.setNum_buy_songs(100);
        this.setAdvertisement(true);
    }
    
    
    public void addSongToPlaylist(Songs song, int playlist){
        array_playlist.get(playlist).setIttemList_songs(song);
    }
    
    public void addPodcastToPlaylist(Podcast podcast, int playlist){
        array_playlist.get(playlist).setIttemList_podcast(podcast);
    }
    
    public Playlist getIttemArray_playlist(int playlist) {
        return array_playlist.get(playlist);
    }

    public ArrayList<Playlist> getArray_playlist() {
        return array_playlist;
    }

    public Playlist createPlaylist(String name) {
        
        array_playlist.add(new Playlist(name));
        
        return array_playlist.get(array_playlist.size() -1);
    }
    
}
