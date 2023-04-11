import java.util.*;

public class Problems {
    public static void main(String[] args) {
        findSmallest( 30, 1100 ,10);
    }

    List<Integer> list = new ArrayList<>();


    // print 1 to 100 without loop
    static void printNumber(int num){
        if(num <= 100){
            System.out.println(num);
            num++;
            printNumber(num);
        }
    }


    // Find smallest of 3 numbers with less code
    // solution use another variable
    static void findSmallest(int x, int y, int z){
        int num = 0;

        if(x<y)
            num = x;
        else
            num = y;

        if(z < num)
            num = z;
        System.out.println(num);
    }

    public static int birthdayCakeCandles(List<Integer> candles) {
        // Write your code here
        Collections.sort(candles);
        int max = 0;
        int count = 0;
        for(int i : candles){
            if( i > max)
                max = i;
        }
        for(int i : candles){
            if(max == i)
                count++;
        }
        System.out.println("Count = " + count);
        return count;
    }


}
