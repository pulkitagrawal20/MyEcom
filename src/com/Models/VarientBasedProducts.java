package com.Models;

import java.util.List;

public class VarientBasedProducts extends Product{
    List<Varients> varients;

    public VarientBasedProducts(String name, String imageURL, List<Varients> varients) {
        super(name, imageURL);
        this.varients = varients;
    }

    @Override
    public String toString() {
        return "VarientBasedProducts{" +
                "name='" + name + '\'' +
                ", imageURL='" + imageURL + '\'' +
                ", varients=" + varients +
                '}';
    }
}
