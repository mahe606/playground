package Maps;

import java.util.ArrayList;
import java.util.List;

public class ListIterations {
    public static void main(String[] args) {

        /*this programs explains 5 ways of iterating a HashMap*/
        List<String> courseList = new ArrayList<>();
        courseList.add("C");
        courseList.add("C++");
        courseList.add("Java");
        courseList.add("Spring");

        // Iteration using enhanced for loop and Entry
        System.out.println("\nIteration using enhanced for loop and Entry");
        for(String str: courseList){
            System.out.println(str);
        }

        // Iteration using Lambda Expression
        System.out.println("\nIteration using Lambda Expression");
        courseList.forEach((value) -> {
            System.out.println(value);
        });

        // Iteration using streams
        System.out.println("\nIteration using streams");
        courseList.stream().forEach(str->System.out.println(str));
    }
}
