package Arrays;

import java.util.Arrays;

class ArraySlice {

    public static void main(String[] args) {
        int[] a = {2,4,1,6,5,9,7};
        System.out.println(solution(a));
    }
    public static int solution(int[] arr) {
        int ans = 0, max_so_far = 0;
        for (int i = 0; i < arr.length; ++i) {

            // Find maximum in prefix arr[0..i]
            max_so_far = Math.max(max_so_far, arr[i]);

            // If maximum so far is equal to index, we can
            // make a new partition ending at index i.
            if (max_so_far == i)
                ans++;
        }
        return ans;
    }

    public static int[] sort(int[] a){
        int temp = 0;
        for(int i= 0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]>a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        return a;
    }

    public static int[] concat(int[] x, int[] y){
        int total  = x.length + y.length;
        int[] z = new int[total];
        for (int i = 0; i < x.length; i++) {
            z[i] = x[i];
        }
        for (int i = 0; i < (y.length); i++) {
            z[i+x.length] = y[i];
        }
        System.out.println(Arrays.toString(z));
        return z;
    }
}