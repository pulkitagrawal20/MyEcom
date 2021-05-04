package com.streamliners_task4_1;

public class Main {

    public static void main(String[] args) {
        /*
        //  Creating an object of Product class
        Product product = new Product("Apple", "a.bc");
        System.out.println(product);
*/
        /*
        // Creating an object of WeightBasedProduct class
        WeightBasedProduct product = new WeightBasedProduct("Apple", "a.bc", 1, 120);
        System.out.println(product);
        System.out.println(product.name);
*/
        /*
        // creating an object of Variant based product
        VariantBasedProduct product = new VariantBasedProduct( "Mango","m.bc", new ArrayList<>(
                        Arrays.asList(new Variant("500g", 150),
                                new Variant("1kg", 270))
                )
        );
        System.out.println(product);
*/
        /*
        // Trying the list data type
        List<String> strings = new ArrayList<>(
                Arrays.asList("A", "B", "C")
        );
        System.out.println(strings);
*/
      /*
        // Null pointer exception error:
        Product product = new Product();
        System.out.println(product.name);
        System.out.println(product.name.toUpperCase());
*/
       /*

        // Checking Hashcode equality:
        Product a = new Product("a", "");
        Product b = new Product("a", "");
        System.out.println(a.hashCode());
        System.out.println(b.hashCode());
        System.out.println(a.equals(b));

         */
        /* Basic program Review:
	//Create Products
        Product apple=new WeightBasedProduct("Apple","a.bc",120,1);
        Product mango=new VarientBasedProducts("Mango","m.bc",new ArrayList<>(
                Arrays.asList(
                        new Varients("500g",150)
                        ,new Varients("1 Kg",270)
                )
        ));
        //Add Products In A List
        List<Product> products=new ArrayList<>(
                Arrays.asList(apple,mango)
        );
        System.out.println(products);

         */

    }



}
