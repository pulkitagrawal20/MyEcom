package com.streamliners_task_4_2_1.Models;

import com.streamliners_task4_1.Models.Variants;

import java.util.List;

public class Product {
    //common
    public String name,imageURL;
    public int type;
    //wbp:
    public float pricePerKg;
    float minQuantity;
    //vbp:
    public List<Variants> variants;

    public Product(){

    }

    //wb PRODUCT CONSTRUCTOR:
    public Product(String name, String imageURL, float pricePerKg, float minQuantity) {
        type=ProductType.TYPE_wb;
        this.name = name;
        this.imageURL = imageURL;
        this.pricePerKg = pricePerKg;
        this.minQuantity = minQuantity;
    }
    //vb PRODUCT CONSTRUCTOR:
    public Product(String name, String imageURL, List<Variants> variants) {
        type=ProductType.TYPE_vb;
        this.name = name;
        this.imageURL = imageURL;
        this.variants = variants;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();

             if (this.type == ProductType.TYPE_wb) {
                stringBuilder.append("WeightBasedProduct { ");
             } else {
                 stringBuilder.append("VariantBasedProduct { ");
             }

             stringBuilder.append("name = ").append(this.name);

             if (this.type == ProductType.TYPE_vb) {
                 stringBuilder.append("minQty = ").append(this.minQuantity);
                 stringBuilder.append(", pricePerKg = ").append(this.pricePerKg);
             } else {
                 stringBuilder.append(", variants = ").append(this.variants);
             }
             stringBuilder.append(" } ");

             return stringBuilder.toString();
    }
}

