package sort;

public class MaxNumber {
    public static void main(String[] args) {
        System.out.println("Start...");
        int[] n = {50, 300, 20, 10};
        System.out.println("\n"+maxNumber(n));
    }
    //finds the max number in given int array
    // checks if next number is grater and swaps
    public static int maxNumber(int[] n){

        for (int i = 0; i < n.length; i++) {
            System.out.print(n[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < n.length-1; i++) {
            if (n[i] > n[i+1]) {
                int temp = n[i];
                n[i] = n[i+1];
                n[i+1] = temp;
            }
        }
        for (int i = 0; i < n.length; i++) {
            System.out.print(n[i] + " ");
        }

        return n[n.length-1];
    }
}
