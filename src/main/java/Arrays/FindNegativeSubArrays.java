package Arrays;

import java.util.Scanner;

public class FindNegativeSubArrays {
    public static void main(String[] args) {

        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        Scanner sc = new Scanner(System.in);
        int arrayLength = sc.nextInt();
        int a[] = new int[arrayLength];
        for(int i = 0;i<arrayLength;i++){
            a[i] = sc.nextInt();
        }
        int sum = 0;
        int count = 0;
        for(int i = 0; i<a.length; i++){
            sum = a[i];
            if(sum<0){
                count++;
            }
            for(int j = i+1; j<a.length; j++){
                sum = sum+a[j];
                //System.out.println(sum);
                if(sum<0){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
