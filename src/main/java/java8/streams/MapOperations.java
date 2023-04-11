package java8.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapOperations {

    public static void main(String[] args) {
        // Arrays to stream
        int[] arr = {10, 20, 30, 40, 50};
        Arrays.stream(arr).map(num -> {
            num = num + 5;
            return num;
        }).forEach(System.out::println);


        // List to stream
        List<String> list = new ArrayList<>();
        list.add("Mahesh");
        list.add("Mithran");
        list.stream().map(str -> {
            str = str.concat(" CSCS");
            return str;
        }).forEach(System.out::println);


        // Convert $ to rupee
        String phrase = "Payment of $3500 is done to buy a $600 gold $ locket";
        List<String> list1 = Arrays.stream(phrase.split(" "))
                .filter(str -> str.length()>1 && str.startsWith("$")).collect(Collectors.toList());
        for(String str:list1){
            phrase = phrase.replace(str,str.replace("$","₹"));
        }
        System.out.println(phrase);


    }



}
