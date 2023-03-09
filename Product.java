package org.example;

public class Product {

    public Product(String name, float price, byte rating){
        this.name = name;
        this.price = price;
        this.rating = rating;
    }
    public Product(){}

    private String name;
    private float price;
    private byte rating;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public byte getRating() {
        return rating;
    }

    public void setRating(byte rating) {
        this.rating = rating;
    }


}
