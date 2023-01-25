package main.java.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.SortedMap;

public class ListDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        //Maintains Insertion Order
        list.add("element1");
        list.add("element2");
        list.add("element4");
        list.add("element3");
        list.add("element5");
        System.out.println(list);


        // List allows duplicate
        list.add("element5");
        System.out.println(list);

        // list allows null
        list.add(null);
        System.out.println(list);

        // access elements in list
        System.out.println(list.get(0));
        System.out.println(list.get(5));

    }
}
