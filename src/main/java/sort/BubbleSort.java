package main.java.sort;

public class BubbleSort {
    public static void main(String[] args) {
        int[] num = {1, 2, 3, 4, 5};
        bSort(num);
    }

    /*loop till length-1 , then loop till length -2.....
    * while traversing check if next element of grater then swap*/
    //https://www.youtube.com/watch?v=7r6UoMxULiE
    public static void bSort(int[] num){
        // in bubble sort outer loop is just a counter, to loop till n-1

        boolean swapped = false;
        for (int j = 0; j < num.length - j; j++) {
            if (num[j] > num[j+1]){
                int temp = num[j];
                num[j] = num[j+1];
                num[j+1] = temp;
                swapped = true;
            }
        }      for (int i = 1; i < num.length; i++) {

            // if no swap happened in the inner loop, which means array is sorted already, so we can break
            if(!swapped){
                System.out.println("Array sorted in " + i +"th pass");
                break;
            }

        }
        printArray(num);
    }

    public static void printArray(int[] n){
        for (int i = 0; i < n.length; i++) {
            System.out.print(n[i] + " ");
        }
        System.out.println();
    }


}
