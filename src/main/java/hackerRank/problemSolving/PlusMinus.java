package hackerRank.problemSolving;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//https://www.hackerrank.com/challenges/plus-minus/problem?isFullScreen=true
public class PlusMinus {

    public static void main(String[] args) {
        ArrayList<Integer> n = new ArrayList<>();
        n.add(1);
        n.add(1);
        n.add(0);
        n.add(-1);
        n.add(-1);
        plusMinus(n);
    }


    public static void plusMinus(List<Integer> arr) {
        double positiveCount = arr.stream().filter(num -> num > 0).count();
        double negativeCount = arr.stream().filter(num -> num < 0).count();
        double zeroCount = arr.stream().filter(num -> num == 0).count();
        double size = arr.size();
        System.out.println(String.format("%.6f", positiveCount/size));
        System.out.println(String.format("%.6f", negativeCount/size));
        System.out.println(String.format("%.6f", zeroCount/size));
    }
}
