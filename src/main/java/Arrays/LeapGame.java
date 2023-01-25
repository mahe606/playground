package Arrays;

import java.util.Scanner;

public class LeapGame {
    public static boolean canWin(int leap, int[] game) {
        // Return true if you can win the game; otherwise, return false.
        boolean canWin = true;
        boolean nextMove = true;
        int i = 0;
        int n = game.length;
       while (i<n){
           System.out.printf("i is %d and value is %d \n", i, game[i]);
           if(i+leap >= n-1 || i+1 >= n-1){
               return true;
           }else if(game[i+leap] == 0){
               i = i+leap;
           }else if(game[i+1]==0){
               i++;
           }else {
               System.out.println("No more option available");
               return false;
           }

       }
       return false;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        while (q-- > 0) {
            int n = scan.nextInt();
            int leap = scan.nextInt();

            int[] game = new int[n];
            for (int i = 0; i < n; i++) {
                game[i] = scan.nextInt();
            }

            System.out.println( (canWin(leap, game)) ? "YES" : "NO" );
        }
        scan.close();
    }
}
