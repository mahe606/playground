package main.java.Maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapDemo {
    //https://www.hackerrank.com/challenges/phone-book/problem?isFullScreen=true
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Map<String,Long> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String name = sc.next();
            long no = sc.nextLong();
            map.put(name,no);
        }
        System.out.println(map.toString());
        int q = sc.nextInt();
        for (int i = 0; i < q; i++) {
            String name = sc.next();
            if(map.containsKey(name)){
                System.out.println(name + "=" + map.get(name));
            }else{
                System.out.println("Not found");
            }
        }
    }
}
