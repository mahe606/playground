package java8.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class StreamOperations {

    public static void main(String[] args) {
        //mapOperation();
        flatMapOperation();
        convertDollarToRupee();
        filterOperation();
        findLongestString();
    }

    // map operation
    public static void mapOperation(){
        List<String> names = new ArrayList<>();
        names.add("Mahesh");
        names.add("Mohan");
        names.add("Devaki");
        names.add("Karthik");

        names.stream() // create operation
                .map(str -> str.toUpperCase()) // Intermediate operation 1
                .map(str -> str.concat(" Atmecs"))  // Intermediate operation 2
                .forEach(System.out::println); // terminal operation

    }

    public static void flatMapOperation(){
        String[] arrayOfWords = {"mahesh", "Thamilarasu"};
        Stream<String> streamOfWords = Arrays.stream(arrayOfWords);

        /* streamOfLetters will hold stream of string arrays here its [M a h e s h] and [T a m i l a r a s u]*/
        Stream<String[]> streamOfLetters= streamOfWords.map(word -> word.split(""));

        /* here when we use flat map it will treat the 2 string[] arrays as 1*/
        streamOfLetters.flatMap(Arrays::stream).forEach(System.out::println);
    }

    public static void filterOperation(){
        List<String> names = new ArrayList<>();
        names.add("Mahesh");
        names.add("Mohan");
        names.add("Devaki");
        names.add("Karthik");

        System.out.println();
        List<String>  filtered = names.stream().filter(name -> name.startsWith("M")).toList();
        System.out.println(filtered);
    }

    public static void convertDollarToRupee(){
        String phrase = "Payment of $3500 is done to buy a $600 gold $ locket";
        Stream<String> streamOfWords = Arrays.stream(phrase.split(" "));
        List<String> filtered = streamOfWords.filter(u->u.startsWith("$")).filter(u->u.length()!= 1).toList();
        for(String str:filtered){
            phrase = phrase.replace(str,str.replace("$","₹"));
        }
        System.out.println(phrase);
    }

    public static void findLongestString(){
        String phrase = "Payment fvfvfvfvfvfv of $3500 is done to buy a $600 gold $ locket";
        String longString = Arrays.stream(phrase.split(" ")).max(Comparator.comparingInt(String::length)).orElse(null).toString();
        System.out.println("The longest String is " + longString);
    }
}
