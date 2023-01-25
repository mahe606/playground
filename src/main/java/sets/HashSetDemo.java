package sets;

import java.util.HashSet;
import java.util.Scanner;

public class HashSetDemo {
    //https://www.hackerrank.com/challenges/java-hashset/problem?isFullScreen=true
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int t = sc.nextInt();
        HashSet<String> set = new HashSet<>();
        for (int i = 0; i < t; i++) {
            String a = sc.next();
            String b = sc.next();
            set.add(a + " " + b);
            System.out.println(set.size());
        }

    }
}
