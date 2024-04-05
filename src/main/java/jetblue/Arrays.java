package jetblue;

import java.util.*;
import java.util.stream.Stream;

public class Arrays {
    public static void main(String[] args) {
        int arr[] = {6, 7, 10, 9, 1, 10, 22, 11};


        //System.out.println(getNthHighest(arr,3));

        int[] a = {1, 2, 8, 3, 4, 4, 5, 2, 5, 7, 8, 8};
        int j = 0;
        //j = removeDuplicates1(a);

        // printing array elements
       // for (int i = 0; i < j; i++)
           // System.out.print(a[i] + " ");

/*        int b[] = { 1, 2, 2, 3, 3, 4, 4, 4, 5, 5, 6 };
        removeDuplicatesUsingSet(b);

        int c[] = { 1, 2, 2, 3, 3, 4, 4, 4, 5, 5, 6 };
        removeDuplicatesUsingMap(c);*/

        int d[] = {1, 2, 22, 3, 3, 4, 4, 4, 0, 5, 6};
       // getMinMaxValue(d);

        String str = "Mahesh Thamilaraasu";
        //getMostRecurringChar(str);

        int e[] = {9, 8, 7, 6, 5, 4, 3, 2, 1};
        //reverseIntArray(e);

        int f[] = {1, 33, 20, 3, 10, 5};
        subArraySum(f, 18);

        int g[] = {1, 2, 3, 5};
       // missingNumberInArray(g, 5);

        int h[] = {1, 5, 7, -1, 5};
       // getPairsCount(h, 6);

        int i[] = {1, 2, 3, 6, 3, 6, 1, 1};
        //findDuplicatesInArray(i);

        int arr1[] = {1, 2, 4, 5, 6};
        int arr2[] = {2, 3, 5, 7};

        //unionOfArray(arr1, arr2);
        //intersectionOfArray(arr1, arr2);
        int k[] = {0,8, 7, 0, 0, 4, 0, 2, 1, 9, 0};
        moveZerosToOneSideUsingArray(k);
    }

    /*Move all the 0s to one side of the array without modifying/sorting the other values */
    public static void moveZerosToOneSide(int[] a) {
        // {8,7,0,4,0,2,1,9,0}
        Stream<Integer> temp = Stream.concat(java.util.Arrays.stream(a).filter(num -> num != 0).boxed()
                , java.util.Arrays.stream(a).filter(num -> num == 0).boxed());

        System.out.println(java.util.Arrays.toString(temp.toArray()));
    }

    public static void moveZerosToOneSideUsingArray(int[] a) {
        // {8,7,0,4,0,2,1,9,0}

        int j=0;
        for (int i = 0; i < a.length; i++) {
            if(a[i] != 0){
                a[j] = a[i];
                j++;
            }
        }
        for (int i = j; i < a.length; i++) {
            a[i]=0;
        }
        System.out.println(java.util.Arrays.toString(a));
    }

    public static void intersectionOfArray(int a[], int b[]) {
        int m = a.length;
        int n = b.length;
        int i = 0, j = 0;

        System.out.println("The intersection of the array is ");
        while (i < m && j < n) {
            if (a[i] < b[j]) {
                i++;
            } else if (a[i] > b[j]) {
                j++;
            } else {
                System.out.print(b[j] + " ");
                i++;
                j++;
            }
        }

    }

    /* Function prints union of arr1[] and arr2[] */
    public static void unionOfArray(int a[], int b[]) {
        int m = a.length;
        int n = b.length;
        int i = 0, j = 0;
        System.out.println("Union of array is.. ");
        while (i < m && j < n) {
            if (a[i] < b[j]) {
                System.out.print(a[i] + " ");
                i++;
            } else if (a[i] > b[j]) {
                System.out.print(b[j] + " ");
                j++;
            } else {
                System.out.print(b[j] + " ");
                i++;
                j++;
            }
        }

        //print the remaining elements in a
        while (i < m) {
            System.out.print(a[i] + " ");
            i++;
        }

        //print the remaining elements in b
        while (j < n) {
            System.out.print(b[j] + " ");
            j++;
        }


    }

    /*Input array[] = {1, 2, 3, 6, 3, 6, 1}
    Output: 1, 3, 6
    */
    public static void findDuplicatesInArray(int a[]) {
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] == a[j]) {
                    System.out.println("Duplicate :" + a[i]);
                }
            }
        }
    }

    public static int getNthHighest(int[] a, int n) {
        if (n == 0 || n > a.length) {
            return n;
        }
        sort(a);
        return a[a.length - n];
    }

    // simple array sort
    public static void sort(int[] arr) {
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < i; j++) {

                if (arr[i] < arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
                //System.out.println(java.util.Arrays.toString(arr));
            }
        }
    }

    public static int removeDuplicates1(int[] a) {
        java.util.Arrays.sort(a);
        int length = a.length;
        int j = 0;
        for (int i = 0; i < length - 1; i++) {
            System.out.println("Iteration " + i);
            System.out.println(a[i] + " " + a[i + 1] + " ");
            System.out.println("j=" + j);

            // check if the ith element is not equal to
            // the (i+1)th element, then add that element
            // at the jth index in the same array
            // which indicates that te particular element
            // will only be added once in the array
            if (a[i] != a[i + 1]) {
                System.out.println(java.util.Arrays.toString(a));
                a[j++] = a[i];
                System.out.println(java.util.Arrays.toString(a));
            }
            System.out.println();
        }
        System.out.println(j + " " + a[length - 1]);
        a[j++] = a[length - 1];
        return j;
    }


    public static void removeDuplicatesUsingSet(int[] a) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < a.length; i++) {
            set.add(a[i]);
        }
        System.out.println(set.toString());
    }

    public static void removeDuplicatesUsingMap(int[] a) {
        HashMap<Integer, Boolean> map = new HashMap<>();
        for (int i = 0; i < a.length; i++) {
            if (map.get(a[i]) == null) {
                System.out.print(a[i] + " ");
                map.put(a[i], true);
            }
        }
    }

    public static void getMinMaxValue(int[] a) {
        int min = a[0];
        int max = a[0];

        for (int i = 0; i < a.length; i++) {
            if (a[i] < min)
                min = a[i];
            if (a[i] > max)
                max = a[i];
        }
        System.out.println(java.util.Arrays.toString(a) + "min is " + min + " max is " + max);
    }


    public static int getIndex(String str, String c) {
        return str.indexOf(c);
    }

    public static String getMostRecurringChar(String str) {
        char[] c = str.toCharArray();
        int[] freq = new int[c.length];
        for (int i = 0; i < c.length; i++) {
            freq[i] = 1;
            for (int j = i + 1; j < c.length; j++) {
                System.out.println(c[i] + " " + c[j]);
                if (c[i] == c[j] /*&& c[i] != ' ' && c[i] != '0'*/) {
                    freq[i]++;
                    //c[j] = '0';
                }
            }
        }

        int max = 0;
        String maxChar = null;
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] > max) {
                max = freq[i];
                maxChar = c[i] + "";
            }
        }
        System.out.println("Maximum occurring character: " + maxChar);
        return null;
    }

    public static void reverseIntArray(int[] a) {
        int start = 0;
        int end = a.length - 1;
        int temp = 0;
        // loop to swap first and last , first-1 and last-1 and so on...
        while (start < end) {
            temp = a[start];
            a[start] = a[end];
            a[end] = temp;
            start++;
            end--;
        }
        System.out.println(java.util.Arrays.toString(a));
    }


    public static void subArraySum(int[] a, int sum) {
        int checkSum = 0;
        for (int i = 0; i < a.length - 1; i++) {
            System.out.println("i is " + a[i]);
            checkSum = a[i];
            if (checkSum == sum) {
                System.out.println("the sum is at index " + i);
                return;
            }
            for (int j = i + 1; j < a.length ; j++) {

                checkSum += a[j];
                System.out.println("checkSum is " + checkSum);
                if (checkSum == sum) {
                    System.out.println("the range is between " + i + " and " + j);
                    return;
                }
            }
        }
        System.out.println("no sum range found..");
    }

    public static void missingNumberInArray(int a[], int n) {
        int total = n * (n + 1) / 2;
        int sumOfArray = 0;
        for (int i = 0; i < a.length; i++) {
            sumOfArray += a[i];
        }
        System.out.println("The missing number is " + (total - sumOfArray));
    }

    /*Input:  arr[] = {1, 5, 7, -1}, sum = 6
    Output:  2*/
    public static void getPairsCount(int a[], int sum) {
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] + a[j] == sum) {
                    count += 1;
                }
            }
        }
        System.out.println("the pairs count is " + count);
    }


}
