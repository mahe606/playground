package Maps;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class HashMapIterations {
    public static void main(String[] args) {

        /*this programs explains 5 ways of iterating a HashMap*/
        HashMap<Integer, String> courseMap = new HashMap<>();
        courseMap.put(1, "C");
        courseMap.put(2, "C++");
        courseMap.put(3, "Java");
        courseMap.put(4, "Spring");

        // Entry is nothing but an element in a map

        // Iteration through entrySet using Iterator.
        Iterator<Entry<Integer, String>> iterator = courseMap.entrySet().iterator();
        System.out.println("\nIteration through entrySet using Iterator.");
        Entry<Integer, String> entry = null;
        while (iterator.hasNext()){
            entry = iterator.next();
            System.out.println(entry.getKey() +" " +entry.getValue());
        }


        // Iteration using keySet and iterator
        Iterator<Integer> iterator1 = courseMap.keySet().iterator();
        System.out.println("\nIteration using keySet and iterator");
        while (iterator1.hasNext()){
            Integer key = iterator1.next();
            System.out.println(key + " " + courseMap.get(key));
        }

        // Iteration using enhanced for loop and Entry
        System.out.println("\nIteration using enhanced for loop and Entry");
        for(Entry<Integer, String> entry1: courseMap.entrySet()){
            System.out.println(entry1.getKey() +" " +entry1.getValue());
        }

        // Iteration using Lambda Expression
        System.out.println("\nIteration using Lambda Expression");
        courseMap.forEach((key, value) -> {
            System.out.println(key +" " +value);
        });

        // Iteration using streams
        System.out.println("\nIteration using streams");
        courseMap.entrySet().stream().forEach(entry3 -> System.out.println(entry3.getKey() +" " +entry3.getValue()));
    }
}
