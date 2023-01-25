package main.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RoughNote {
    public static void main(String[] args) {
        List<Integer> scores = new ArrayList<>();
        System.out.println("Hello World...");

        String str = "sample string";
        int count[] = new int[256];

        // Construct character count array from the input
        // string.
        int len = str.length();
        count['s']++;
        count['a']++;
        count['a']++;
        count['a']++;
/*        for (int i = 0; i < len; i++) {
            System.out.println(str.charAt(i));
            count[str.charAt(i)]++;
        }*/
        System.out.println(Arrays.toString(count));



    }

    public int powerSum(int x, int n){

        return 0;
    }

}
