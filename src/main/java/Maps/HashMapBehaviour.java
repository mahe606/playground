package Maps;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class HashMapBehaviour {
    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();

        // Passing null string literal
        hm.put(null, 23);
        hm.put(null,24);
        System.out.println(hm);

        // Passing new(empty) string object
        hm.put(new String(), 25);
        hm.put(new String(), 26);
        System.out.println(hm);

        System.out.println(hm.get(""));



    }
}
