package com.staff.staffapp.model;

//import org.parceler.Parcel;
//
//@Parcel
public class Product {
    int id;
    String title;
    String description;

    public Product() { }

    public Product(int id, String title, String description) {
        this.id = id;
        this.title = title;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }
}
