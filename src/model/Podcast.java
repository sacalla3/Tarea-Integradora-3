/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author sacal
 */
public class Podcast {
    
    private String name;
    private String description;
    private String category;
    private String url_image;
    private double duration;
    private int num_reproductions;

    public Podcast(String name, String description, String category, String url_image, double duration) {
        this.name = name;
        this.description = description;
        this.category = category;
        this.url_image = url_image;
        this.duration = duration;
        this.num_reproductions = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getUrl_image() {
        return url_image;
    }

    public void setUrl_image(String url_image) {
        this.url_image = url_image;
    }

    public double isDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    public int getNum_reproductions() {
        return num_reproductions;
    }

    public void setNum_reproductions(int num_reproductions) {
        this.num_reproductions = num_reproductions;
    }

    @Override
    public String toString() {
        return "name=" + name + ", description=" + description + ", category=" + category + ", url_image=" + url_image + ", duration=" + duration + ", num_reproductions=" + num_reproductions;
    }
       
    
}
