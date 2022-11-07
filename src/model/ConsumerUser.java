/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.time.LocalDateTime;

/**
 *
 * @author sacal
 */

public abstract class ConsumerUser {
    
    private String nickname;
    private int id_card;
    private LocalDateTime bonding_date;
    
    private boolean catalog_access;

    /**
     * Get the value of catalog_access
     *
     * @return the value of catalog_access
     */
    public boolean getCatalog_access() {
        return catalog_access;
    }

    public void setCatalog_access(boolean catalog_access) {
        this.catalog_access = catalog_access;
    }
    
    private int num_playlists;

    /**
     * Get the value of num_playlists
     *
     * @return the value of num_playlists
     */
    public int getNum_playlists() {
        return num_playlists;
    }
    

    /**
     * Set the value of num_playlists
     *
     * @param num_playlists new value of num_playlists
     */
    public void setNum_playlists(int num_playlists) {
        this.num_playlists = num_playlists;
    }
    
        private int num_buy_songs;

    /**
     * Get the value of num_buy_songs
     *
     * @return the value of num_buy_songs
     */
    public int getNum_buy_songs() {
        return num_buy_songs;
    }

    /**
     * Set the value of num_buy_songs
     *
     * @param num_buy_songs new value of num_buy_songs
     */
    public void setNum_buy_songs(int num_buy_songs) {
        this.num_buy_songs = num_buy_songs;
    }
    
        private boolean advertisement;

    /**
     * Get the value of advertisement
     *
     * @return the value of advertisement
     */
    public boolean getAdvertisement() {
        return advertisement;
    }

    /**
     * Set the value of advertisement
     *
     * @param advertisement new value of advertisement
     */
    public void setAdvertisement(boolean advertisement) {
        this.advertisement = advertisement;
    }

    public String getNickname() {
        return nickname;
    }

    public int getId_card() {
        return id_card;
    }

    public LocalDateTime getBonding_date() {
        return bonding_date;
    }
    
    public ConsumerUser(String nickname, int id_card, LocalDateTime bonding_date){
        this.nickname = nickname;
        this.id_card = id_card;
        this.bonding_date = bonding_date;
    }

    @Override
    public String toString() {
        return "Nickname=" + nickname + ", id_card=" + id_card + ", bonding_date=" + bonding_date + ", catalog_access=" + catalog_access + ", num_playlists=" + (num_playlists != 99999999 ? num_playlists : "unlimited")  + ", num_buy_songs=" + (num_buy_songs != 99999999 ? num_buy_songs : "unlimited") + ", advertisement=" + advertisement;
    }
    
    
}
