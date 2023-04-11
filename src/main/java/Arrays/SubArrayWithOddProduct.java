package Arrays;

public class SubArrayWithOddProduct {

    public static void main(String[] args) {
        int[] a = {1, 1, 1, 2};
        System.out.println(subArrayWithOddProduct(a));
    }


    public static int subArrayWithOddProduct(int[] a) {
        int count = 0;
        int prod = 1;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 != 0) {
                System.out.println("single count increment");
                count++;
            }
            prod = 1;
            for (int j = i + 1; j < a.length; j++) {
                prod = prod * a[i] * a[j];
                if (prod % 2 != 0) {
                    System.out.println("product count increment" + a[i] +" "+ a[j]);
                    count++;
                }
            }
        }
        return count;
    }
}
