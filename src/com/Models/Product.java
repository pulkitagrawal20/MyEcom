package com.Models;

import java.util.ArrayList;
import java.util.Objects;

public class Product {
    public String name;
    public String imageURL;

    public Product(String name,String imageURL) {
        this.name = name;
        this.imageURL=imageURL;
    }

    public Product(String surf_excel, String imageURL, ArrayList<Variants> varients) {
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", imageURL='" + imageURL + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(name, product.name) && Objects.equals(imageURL, product.imageURL);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, imageURL);
    }
}
