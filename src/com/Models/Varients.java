package com.Models;

public class Varients {
    String name;
    float price;

    public Varients(String name, float price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return String.format("%s @ Rs. %s",name,price);
    }
}
