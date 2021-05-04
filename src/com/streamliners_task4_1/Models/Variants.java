package com.streamliners_task4_1.Models;

public class Variants {
    public String name;
    public float price;

    public Variants(String name, float price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return String.format("%s @ Rs. %s",name,price);
    }
}
