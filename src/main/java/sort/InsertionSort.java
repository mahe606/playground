package sort;

import java.util.Arrays;



public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {5, 1, 3 ,9,4,0};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

//https://www.youtube.com/watch?v=vPymme0CjwE
    public static void insertionSort(int[] arr){
        // animation - https://visualgo.net/en/sorting
        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j > 0 ; j--) {
                if(arr[j] < arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }else
                    break;
            }
        }
    }
}
