package com.example.cardproducttest;

public class Book {

    private String tittle;
    private String category;
    private String description;
    private int thumbnail;

    public Book() {
    }

    public Book(String tittle, String category, String description, int thumbnail) {
        this.tittle = tittle;
        this.category = category;
        this.description = description;
        this.thumbnail = thumbnail;
    }

    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(int thumbnail) {
        this.thumbnail = thumbnail;
    }
}
