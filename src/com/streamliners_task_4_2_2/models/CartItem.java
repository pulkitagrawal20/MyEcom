package com.streamliners_task_4_2_2.models;

public class CartItem {
    String name;
    public float unitPrice,quantity;

    public CartItem(String name, float unitPrice, float quantity) {
        this.name=name;
        this.unitPrice=unitPrice;
        this.quantity=quantity;
    }

    public float Cost(){
        return unitPrice*quantity;
    }

    @Override
    public String toString() {
        return "\n\t" + name + " ( " +
                String.format("%f X %f = %f", unitPrice, quantity, Cost()) +
                " )";

    }
}
