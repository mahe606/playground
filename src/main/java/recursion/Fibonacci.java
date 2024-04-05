package recursion;

public class Fibonacci {

    public static int count = 0;
    public static int fibonacci(int n) {
        if(n <= 1) {
            return n;
        }
        System.out.println(++count +"Called for " + (n-1) + " and " + (n-2));
        return fibonacci(n-1) + fibonacci(n-2);
    }

    public static void main(String[] args) {
        int n = 6;
        System.out.println("The " + n + "th Fibonacci number is: " + fibonacci(n));
    }
}
