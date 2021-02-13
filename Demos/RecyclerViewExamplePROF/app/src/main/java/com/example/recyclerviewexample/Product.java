package com.example.recyclerviewexample;

public class Product {

    // fields
    private String name;
    private int image;

    public Product( String name, int image){

        this.name = name;
        this.image = image;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }


    @Override
    public String toString() {
        return "" +
                "name='" + name + '\'' +
                ", image=" + image ;
    }
}
