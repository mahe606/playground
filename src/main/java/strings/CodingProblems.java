package strings;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Stream;

public class CodingProblems {
    public static void main(String[] args) {
        reverseSentence("I love India");

        String[] input = {"apple", "ape", "appril"};
        longestCommonPrefix(input);

        String[] s = { "geeks", "for", "geeks", "contribute", "practice"};
        String word1 = "geeks", word2 = "practice";
        minDisBetweenWords(s, word1, word2);

        validateIPAddress("1.1.1.256");

        System.out.println(formatLicenseKey("5F3Z-2e-9-w-24-2-3",5));

    }

    /*Given a string S that consists of only alphanumeric characters and dashes.
    The string is separated into N + 1 groups by N dashes. Also given an integer K.

    We want to reformat the string S, such that each group contains exactly K characters,
    except for the first group, which could be shorter than K but still must contain at least
    one character. Furthermore, a dash must be inserted between two groups,
     and you should convert all lowercase letters to uppercase.*/
    public static String formatLicenseKey(String key, int k){
        String[] a =  stringReverse(key.replace("-","")).split("");
        String tempKey = "";
        for (int i = 0; i < a.length; i++) {
            tempKey+=a[i];
            if((i+1)%k==0 && i < a.length-1)
                tempKey+="-";
        }
        return  stringReverse(tempKey);
    }

    public static String stringReverse(String s){
        return new StringBuilder(s).reverse().toString();
    }

    public static boolean validateIPAddress(String s){
        String[] a = s.split("\\.");
        System.out.println(a.length);
        if(a.length>4){
            System.out.println("Not valid IP - length check failed");
            return false;
        }

        Stream<String> stream = Arrays.stream(a);
        if(stream.filter(num -> Integer.parseInt(num) < 255).count() < 4)
            return false;
       return true;
    }

    public static void minDisBetweenWords(String[] a, String str1, String str2){
        int start = 0, end = 0;

        for (int i = 0; i < a.length; i++) {
            if(a[i].equals(str1))
                start = i;
            if(a[i].equals(str2))
                end = i;
        }

        System.out.println("The min distance is " + (end-start));
    }

    public static void longestCommonPrefix(String[] a){
        int size = a.length;
        Arrays.sort(a);

        //find the word with min length
        int min = Math.min(a[0].length(), a[size-1].length());

        int i=0;
        while (i< min && a[0].charAt(i) == a[size-1].charAt(i))
            i++;

        System.out.println( "The longest Common Prefix is : " + a[0].substring(0,i));
    }


    public static void reverseSentence(String phrase){
        String[] words= phrase.split(" ");
        String tempPhrase = "";
        for (int i = words.length-1; i >= 0; i--) {
            tempPhrase+=words[i] + " ";
        }
        System.out.println(tempPhrase);
    }
}
