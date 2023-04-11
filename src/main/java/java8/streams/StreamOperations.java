package java8.streams;

import java.util.*;
import java.util.function.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamOperations {

    public static void main(String[] args) {
/*        mapOperation();
        flatMapOperation();
        convertDollarToRupee();
        filterOperation();
        findLongestString();
        findFirstElement();
        findDuplicate();
        countGivenChar();*/

        reverseElements();
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
                .map(str -> str.concat(" Atmecs"))// Intermediate operation 2
                .map(s-> {
                    s = s.replace("Atmecs", "CSCS");
                    return s;
                })
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

    public static void findFirstElement(){
        Stream<String> stream
                = Stream.of("Geek_First", "Geek_2",
                "Geek_3", "Geek_4",
                "Geek_Last");

        System.out.println(stream.findFirst().get());

        Stream<String> stream1
                = Stream.of("Geek_First", "Geek_2",
                "Geek_3", "Geek_4",
                "Geek_Last");

        System.out.println(stream1.reduce((first, second) -> second).get());
    }


    public static void findDuplicate() {
        Stream<Integer> stream = Stream.of(5, 13, 4, 21, 13, 27, 2, 59, 59, 34, 59);

        Set<Integer> set = new HashSet<>();
        Set<String> stringSet = new HashSet<>();

        List<Integer> dup = stream.filter(num->!set.add(num)).collect(Collectors.toList());
        System.out.println(dup);


        String str = "Welcome to the Altimetrik Hiring program. In this Hiring process," + " we would like to evaluate your programming skills and technology understanding skills. " + " It is a long established fact that a reader will be distracted by the readable content " + " of a page when looking at its layout. The point of using Lorem Ipsum is that " + " it has a more-or-less normal distributioninging of letters, as opposed to using Content here, content here";
        Set<String> sList = Arrays.stream(str.split(" ")).filter(s->!stringSet.add(s.trim())).collect(
                Collectors.toSet());

        System.out.println(sList);
    }


    public static void countGivenChar(){
        String str = "geeksforgeeks";
        String c = "e";
        long count = Arrays.stream(str.split("")).filter( ch -> ch.equals(c)).count();
        System.out.println("Count of given char is " + count);


    }


    public static void reverseElements(){
        Integer[] arr = {10, 20, 30, 40};
        Stream<Integer> stream = Arrays.asList(arr).parallelStream();

        Iterator<Integer> iterator = stream.collect(Collectors.toCollection(LinkedList::new)).descendingIterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }


}
