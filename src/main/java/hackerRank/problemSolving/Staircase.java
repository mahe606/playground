package hackerRank.problemSolving;


//https://www.hackerrank.com/challenges/staircase/problem?isFullScreen=true
public class Staircase {

    public static void main(String[] args) {
        staircase(5);
    }

    public static void staircase(int n) {
        // Write your code here
        int hashCount = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-hashCount; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < hashCount; k++) {
                System.out.print("#");
            }
            System.out.println();
            hashCount++;
        }

    }
}
