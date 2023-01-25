package Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListDemo {
    // https://www.hackerrank.com/challenges/java-list/problem?isFullScreen=true
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // get the list from stdin
        int n = sc.nextInt();
        ArrayList<Integer> l = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            l.add(sc.nextInt());
        }
        System.out.println(l.toString());

        // get the queries from stdin
        int q = sc.nextInt();
        for (int i = 0; i < q; i++) {
            System.out.println("Enter query " + i);
            String operation = sc.next();
            if (operation.equals("Insert")){
                int x = sc.nextInt();
                int y = sc.nextInt();
                l.add(x,y);
            }else if(operation.equals("Delete")){
                int x = sc.nextInt();
                l.remove(x);
            }

        }
        for (int i: l
             ) {
            System.out.println(i + " ");
        }
    }
}
