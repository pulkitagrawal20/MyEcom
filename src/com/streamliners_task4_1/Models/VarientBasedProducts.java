package com.streamliners_task4_1.Models;

import java.util.List;

public class VarientBasedProducts extends Product{
    List<Variants> varients;

    public VarientBasedProducts(String name, String imageURL, List<Variants> varients) {
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
