package recursion;


import java.util.Arrays;

public class BinarySearch {

    public static void main(String[] args) {
        int[] a = new int[100];
        for (int i = 0; i < 100; i++) {
            a[i] = i + 1;
        }
        System.out.println(bSrarch(a,0, a.length-1,13));
        System.out.println(binarySearch(a,0, a.length-1,13));
    }


    public static int bSrarch(int[] a, int first, int last, int key) {
        //System.out.println(Arrays.toString(a));
        if (last>=first) {
            int mid = first + (last - first) / 2;
            //System.out.println("first=" + first + " last=" + last + " mid=" + a[mid]);
            if (a[mid] == key){
                return mid;
            }
            if (a[mid] > key){
                return bSrarch(a, first, mid - 1, key);
            } else {
                return bSrarch(a, mid + 1, last, key);
            }
        }
        return -1;
    }



    public static int binarySearch(int arr[], int first, int last, int key){
        if (last>=first){
            int mid = first + (last - first)/2;
            if (arr[mid] == key){
                return mid;
            }
            if (arr[mid] > key){
                return binarySearch(arr, first, mid-1, key);//search in left subarray
            }else{
                return binarySearch(arr, mid+1, last, key);//search in right subarray
            }
        }
        return -1;
    }
}
