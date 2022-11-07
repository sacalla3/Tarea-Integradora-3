/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.time.*;

/**
 *
 * @author sacal
 */
public abstract class ProducerUsers {
    
    public ProducerUsers(String name, LocalDateTime binding_date, String url_image){
        this.name = name;
        this.binding_date = binding_date;
        this.url_image = url_image;
        
        
    }
    
    private String url_image;

    /**
     * Get the value of url_image
     *
     * @return the value of url_image
     */
    public String getUrl_image() {
        return url_image;
    }

    /**
     * Set the value of url_image
     *
     * @param url_image new value of url_image
     */
    public void setUrl_image(String url_image) {
        this.url_image = url_image;
    }

    
    private LocalDateTime binding_date;

    /**
     * Get the value of binding_date
     *
     * @return the value of binding_date
     */
    public LocalDateTime getBinding_date() {
        return binding_date;
    }

    /**
     * Set the value of binding_date
     *
     * @param binding_date new value of binding_date
     */
    public void setBinding_date(LocalDateTime binding_date) {
        this.binding_date = binding_date;
    }

    private String name;
        

    /**
     * Get the value of name
     *
     * @return the value of name
     */
    public String getName() {
        return name;
    }

    /**
     * Set the value of name
     *
     * @param name new value of name
     */
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "url_image= " + url_image + ", binding_date= " + binding_date + ", name= " + name;
    }

    
}
