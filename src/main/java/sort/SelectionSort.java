package sort;

import java.util.ArrayList;
import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {
        int[] arr = {9,5,45,67, 23, 1};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

//https://www.youtube.com/watch?v=a8egM5SEp6o
    public static void selectionSort(int[] arr) {
        // animation - https://visualgo.net/en/sorting
        for (int i = 0; i < arr.length; i++) {
            int minIndex = i;
            for (int j = i; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            // swap i and minIndex
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }
}
