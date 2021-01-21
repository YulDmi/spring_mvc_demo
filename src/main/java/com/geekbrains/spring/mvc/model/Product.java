package com.geekbrains.spring.mvc.model;

public class Product {
    private int id;
    private String title;
    private int cost;
    private static int count = 0;

    public Product(int id, String title, int cost) {
        this.id = id;
        this.title = title;
        this.cost = cost;
        count++;
    }

    public Product(){
        count++;
    }

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

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public static int getCount() {
        return count;
    }
}
