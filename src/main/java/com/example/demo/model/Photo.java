package com.example.demo.model;


import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;


@Entity
public class Photo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String url;
    @ManyToOne
    private Restaurant restaurant;


    public Photo() {
        super();
    }

    public Photo(String url, Restaurant restaurant) {
        super();
        this.url = url;
        this.restaurant = restaurant;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Restaurant getrestaurant() {
        return restaurant;
    }

    public void setrestaurant(Restaurant restaurant) {
        this.restaurant = restaurant;
    }

    @Override
    public String toString() {
        return "Photo [id=" + id + ", url=" + url + ", restaurant=" + restaurant + "]";
    }


}
