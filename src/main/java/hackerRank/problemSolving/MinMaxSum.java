package hackerRank.problemSolving;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//https://www.hackerrank.com/challenges/mini-max-sum/problem?isFullScreen=true
public class MinMaxSum {

    public static void main(String[] args) {
        ArrayList<Integer> n = new ArrayList<>();
        //256741038 623958417 467905213 714532089 938071625
        n.add(256741038);
        n.add(623958417);
        n.add(467905213);
        n.add(714532089);
        n.add(938071625);
        miniMaxSum(n);
    }


    public static void miniMaxSum(List<Integer> arr) {
        // Write your code here
        int[] a = arr.stream().mapToInt(i->i).toArray();
        int temp = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < i; j++) {

                if (a[i] < a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
                //System.out.println(java.util.Arrays.toString(arr));
            }
        }
        long sum=0;
        for (int i = 0; i < a.length; i++) {
            sum+=a[i];
        }
        System.out.println(sum);
        System.out.println(sum-a[a.length-1] + " " + (sum-a[0]));

    }

}
