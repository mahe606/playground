package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ArrayListProblem {
    public static void main(String[] args) {
        // Getting Input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of lines");
        int n =  sc.nextInt();
        ArrayList<ArrayList<Integer>> rows = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the row " + (i+1));
            int d = sc.nextInt();
            ArrayList<Integer> row = new ArrayList<>();

            for (int j = 0; j < d; j++) {
                row.add(sc.nextInt());
            }
            rows.add(row);
        }
        System.out.println(rows);

        int q = sc.nextInt();
        for (int i = 0; i < q ; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();

            try{
                System.out.println(rows.get(x-1).get(y-1));
            }catch (Exception e){
                System.out.println("Error!");
            }
        }


    }
}
