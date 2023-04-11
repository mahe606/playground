package Arrays;

import java.util.HashSet;
import java.util.Set;

public class DuplicateInArray {

    public static void main(String[] args) {
        int[] arr= {1,2,4,5,1,7,8,2,9,2};
        printDups(arr);
    }


    public static void printDups(int[] a){
        Set<Integer> s= new HashSet<>();

        for (int i = 0; i < a.length; i++) {
            for (int j = i+1; j < a.length; j++) {
                if(a[i] == a[j]){
                    s.add(a[i]);
                }
            }
        }
        System.out.println(s);
    }
}
