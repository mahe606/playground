package java8.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamOperations {

    public static void main(String[] args) {
        //mapOperation();
        flatMapOperation();
        convertDollarToRupee();
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

    public static void convertDollarToRupee(){
        String phrase = "Payment of $3500 is done to buy a gold $ locket";
        Stream<String> streamOfWords = Arrays.stream(phrase.split(" "));
        streamOfWords.map(str -> {
            if(str.startsWith("$") && str.length() > 1)
                phrase.replace(str,str.replace("$","₹"));
            return str;
        });
        System.out.println(phrase);
    }

}
