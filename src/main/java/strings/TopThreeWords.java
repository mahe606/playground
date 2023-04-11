package strings;

import java.util.*;
import java.util.stream.Stream;

public class TopThreeWords {

    /*find the top 3 words of high occurances present in a given String in Case sensitive manner using java 8 streams api :*/
    public static void main(String[] args) {
        String str = "Welcome to the Altimetrik Hiring program. In this Hiring process," +
                " we would like to evaluate your programming skills and technology understanding skills. " +
                " It is a long established fact that a reader will be distracted by the readable content " +
                " of a page when looking at its layout. The point of using Lorem Ipsum is that " +
                " it has a more-or-less normal distributioninging of letters, as opposed to using Content here, content here";
        getLongestWord(str);
    }

    public static String getLongestWord(String str){
        String[] strArr = str.split(" ");
        Optional length = Arrays.stream(strArr).max(Comparator.comparingInt(String::length));
        System.out.println(length.get());
        return null;
    }






}
