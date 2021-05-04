package com.streamliners_task_4_2_1;

import com.streamliners_task4_1.Models.Variants;
import com.streamliners_task_4_2_1.Models.Cart;
import com.streamliners_task_4_2_1.Models.Product;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
         /*
        // Trying Hash Map example
        Map<String, Integer> map = new HashMap<>();
        map.put("A", 123);
        map.put("B", 456);
        map.put("C", 789);
        // return true if "A" exists in the map otherwise false
        System.out.println(map.containsKey("A"));
        */

        Product apple=new Product("Apple","a.bc",120,1);
        Product mango=new Product("Mango","m.bc",new ArrayList<>(
                Arrays.asList(
                        new Variants("500g",150)
                        ,new Variants("1 Kg",270)
                )
        )),
        surfExcel = new Product("Surf Excel", "surf.com", new ArrayList<>(
                Arrays.asList(new Variants("1kg", 180))
        ));
        Cart cart=new Cart();
        cart.add(apple,2.5f);
        cart.add(mango,mango.variants.get(1));
        cart.add(mango,mango.variants.get(1));
        cart.add(surfExcel, surfExcel.variants.get(0));
        cart.add(surfExcel, surfExcel.variants.get(0));
        System.out.println(cart);

        cart.remove(apple);
        System.out.println();
        System.out.println(cart);


        cart.decrement(surfExcel, surfExcel.variants.get(0));
        System.out.println();
        System.out.println(cart);
    }
    }
