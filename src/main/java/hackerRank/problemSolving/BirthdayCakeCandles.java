package hackerRank.problemSolving;

import java.util.ArrayList;
import java.util.List;

//https://www.hackerrank.com/challenges/birthday-cake-candles/problem?isFullScreen=true
public class BirthdayCakeCandles {

    public static void main(String[] args) {
        ArrayList<Integer> n = new ArrayList<>();
        //256741038 623958417 467905213 714532089 938071625
        n.add(3);
        n.add(2);
        n.add(1);
        n.add(0);
        n.add(2);
        n.add(3);
        n.add(3);
        n.add(3);
        System.out.println(birthdayCakeCandles(n));
    }


    public static int birthdayCakeCandles(List<Integer> candles) {
        // Write your code here
        int[] a = candles.stream().mapToInt(i->i).toArray();
/*        int temp = 0;
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
        boolean hasNext = true;
        int count = 1;
        for (int j = a.length-1; j > 0; j--) {
            if(a[j] == a[j-1])
                count++;
            else
                break;

        }*/
        int max = a[0],count=1;
        for (int i = 1; i < a.length; i++) {
            if(a[i] > max)
                max=a[i];
            else if (a[i]==max) {
                count++;
            }
        }
        System.out.println("max= " + max);
        System.out.println("count=" + count);
        return max;
    }
}
