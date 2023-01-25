package main.java.collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        // isEmpty()
        System.out.println("Is the list empty..."+ fruits.isEmpty());


        // add elements
        fruits.add("Mango");
        fruits.add("Apple");
        fruits.add("Banana");
        System.out.println(fruits);

        // modify a value
        fruits.set(2, "Orange");
        System.out.println(fruits);

        // retrieve the element at the given index
        System.out.println("the second fruit is "+ fruits.get(1));

        // remove elements
        fruits.remove("Orange");
        fruits.remove(0);
        System.out.println(fruits);

        // create array list from another collection
        List<Integer> first5PrimeNumbers = new ArrayList<>();
        first5PrimeNumbers.add(2);
        first5PrimeNumbers.add(3);
        first5PrimeNumbers.add(5);
        first5PrimeNumbers.add(7);
        first5PrimeNumbers.add(11);
        System.out.println("first5PrimeNumbers" + first5PrimeNumbers);

        //1. Using constructors
        List<Integer> primeNumbers = new ArrayList<>(first5PrimeNumbers);
        System.out.println("primeNumbers "+ primeNumbers);

        List<Integer> second5PrimeNumbers = new ArrayList<>(); // calling default constructor
        second5PrimeNumbers.add(13);
        second5PrimeNumbers.add(17);
        second5PrimeNumbers.add(19);
        second5PrimeNumbers.add(23);
        second5PrimeNumbers.add(29);
        System.out.println("second5PrimeNumbers" + second5PrimeNumbers);

        //2. using addAll
        primeNumbers.addAll(second5PrimeNumbers);
        System.out.println("primeNumbers "+ primeNumbers);

        //remove all
        primeNumbers.removeAll(first5PrimeNumbers);
        System.out.println("primeNumbers "+ primeNumbers);


    }
}
