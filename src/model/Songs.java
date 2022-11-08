/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author sacal
 */
public class Songs {

    private String name;
    private String album;
    private String gender;
    private String url_cover;
    private double duration;
    private double price;
    private int num_reproductions;
    private int num_sales;

    public Songs(String name, String album, String gender, String url_cover, double duration, double price) {
        this.name = name;
        this.album = album;
        this.gender = gender;
        this.url_cover = url_cover;
        this.duration = duration;
        this.price = price;
        this.num_reproductions = 0;
        this.num_sales = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getUrl_cover() {
        return url_cover;
    }

    public void setUrl_cover(String url_cover) {
        this.url_cover = url_cover;
    }

    public double isDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    public double isPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getNum_reproductions() {
        return num_reproductions;
    }

    public void setNum_reproductions(int num_reproductions) {
        this.num_reproductions = num_reproductions;
    }

    public int getNum_sales() {
        return num_sales;
    }

    public void setNum_sales(int num_sales) {
        this.num_sales = num_sales;
    }

    @Override
    public String toString() {
        return "name=" + name + ", album=" + album + ", gender=" + gender + ", url_cover=" + url_cover + ", duration=" + duration + ", price=" + price + ", num_reproductions=" + num_reproductions + ", num_sales=" + num_sales;
    }
      
}
