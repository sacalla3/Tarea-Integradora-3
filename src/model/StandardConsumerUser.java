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
public class StandardConsumerUser extends ConsumerUser {
    public StandardConsumerUser(String nickname, int id_card, LocalDateTime bonding_date){
        super(nickname, id_card, bonding_date);
        
        this.setCatalog_access(true);
        this.setNum_playlists(20);
        this.setNum_buy_songs(100);
        this.setAdvertisement(true);
    }
    
    
}
