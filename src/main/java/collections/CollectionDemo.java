package main.java.collections;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo {
    public static void main(String[] args) {
        Collection<String> fruits = new ArrayList<>();
        fruits.add("Mango");
        fruits.add("Orange");
        fruits.add("Apple");
        fruits.add("Apple");

        System.out.println(fruits);

        //fruits.remove("Orange");
        System.out.println(fruits.remove("Apple"));
        System.out.println(fruits);

        //toArray
        String[] fruitArray = new String[fruits.size()];
        System.out.println(fruitArray.length);


        //forEach
        System.out.println("elements are ");
        fruits.forEach((element) -> {
            System.out.println(element);
        });


    }
}
