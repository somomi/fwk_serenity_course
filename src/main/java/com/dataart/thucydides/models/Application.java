package com.dataart.thucydides.models;

public class Application {

    private String title;
    private String description;
    private String category;
    private String image;
    private String icon;
    private String author;
    private String downloads;

    public Application(String title, String description) {
        this.title = title;
        this.description = description;
    }

    public void setTitle (String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setDescription (String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setCategory (String category) {
        this.category = category;
    }

    public String getCategory() {
        return category;
    }

    public void setAuthor (String author) {
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setDownloads (String downloads) {
        this.downloads = downloads;
    }

    public String getDownloads() {
        return downloads;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }
}