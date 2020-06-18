package com.bssm.entity;

public class Book {

    private int id;
    private String title;
    private String author;
    private double price;
    private int state;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }


    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }


    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }


}
